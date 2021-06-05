package com.readrops.api.services.freshrss.adapters

import android.annotation.SuppressLint
import com.readrops.api.utils.exceptions.ParseException
import com.readrops.db.entities.Folder
import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonReader
import com.squareup.moshi.ToJson
import java.util.*

class FreshRSSFoldersAdapter {

    @ToJson
    fun toJson(folder: Folder): String = ""

    @SuppressLint("CheckResult")
    @FromJson
    fun fromJson(reader: JsonReader): List<Folder> {
        val folders = mutableListOf<Folder>()

        return try {
            reader.beginObject()
            reader.nextName() // "tags", beginning of folder array
            reader.beginArray()

            while (reader.hasNext()) {
                reader.beginObject()

                val folder = Folder()
                var type: String? = null

                while (reader.hasNext()) {
                    with(folder) {
                        when (reader.selectName(NAMES)) {
                            0 -> {
                                val id = reader.nextString()
                                name = StringTokenizer(id, "/")
                                        .toList()
                                        .last() as String
                                remoteId = id
                            }
                            1 -> type = reader.nextString()
                            else -> reader.skipValue()
                        }
                    }
                }

                if (type == "folder") // add only folders and avoid tags
                    folders += folder

                reader.endObject()
            }

            reader.endArray()
            reader.endObject()

            folders
        } catch (e: Exception) {
            throw ParseException(e.message)
        }
    }

    companion object {
        val NAMES: JsonReader.Options = JsonReader.Options.of("id", "type")
    }
}