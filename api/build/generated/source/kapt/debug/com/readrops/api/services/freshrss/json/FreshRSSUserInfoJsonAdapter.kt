// Code generated by moshi-kotlin-codegen. Do not edit.
package com.readrops.api.services.freshrss.json

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION", "RedundantExplicitType",
    "LocalVariableName")
class FreshRSSUserInfoJsonAdapter(
  moshi: Moshi
) : JsonAdapter<FreshRSSUserInfo>() {
  private val options: JsonReader.Options = JsonReader.Options.of("userEmail", "userId", "userName",
      "userProfileId")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "userEmail")

  override fun toString(): String = buildString(38) {
      append("GeneratedJsonAdapter(").append("FreshRSSUserInfo").append(')') }

  override fun fromJson(reader: JsonReader): FreshRSSUserInfo {
    var userEmail: String? = null
    var userId: String? = null
    var userName: String? = null
    var userProfileId: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> userEmail = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("userEmail",
            "userEmail", reader)
        1 -> userId = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("userId",
            "userId", reader)
        2 -> userName = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("userName",
            "userName", reader)
        3 -> userProfileId = stringAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("userProfileId", "userProfileId", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return FreshRSSUserInfo(
        userEmail = userEmail ?: throw Util.missingProperty("userEmail", "userEmail", reader),
        userId = userId ?: throw Util.missingProperty("userId", "userId", reader),
        userName = userName ?: throw Util.missingProperty("userName", "userName", reader),
        userProfileId = userProfileId ?: throw Util.missingProperty("userProfileId",
            "userProfileId", reader)
    )
  }

  override fun toJson(writer: JsonWriter, value: FreshRSSUserInfo?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("userEmail")
    stringAdapter.toJson(writer, value.userEmail)
    writer.name("userId")
    stringAdapter.toJson(writer, value.userId)
    writer.name("userName")
    stringAdapter.toJson(writer, value.userName)
    writer.name("userProfileId")
    stringAdapter.toJson(writer, value.userProfileId)
    writer.endObject()
  }
}
