package com.readrops.api.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/readrops/api/utils/AuthInterceptor;", "Lokhttp3/Interceptor;", "credentials", "Lcom/readrops/api/services/Credentials;", "(Lcom/readrops/api/services/Credentials;)V", "getCredentials", "()Lcom/readrops/api/services/Credentials;", "setCredentials", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "api_debug"})
public final class AuthInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.Nullable()
    private com.readrops.api.services.Credentials credentials;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.readrops.api.services.Credentials getCredentials() {
        return null;
    }
    
    public final void setCredentials(@org.jetbrains.annotations.Nullable()
    com.readrops.api.services.Credentials p0) {
    }
    
    public AuthInterceptor(@org.jetbrains.annotations.Nullable()
    com.readrops.api.services.Credentials credentials) {
        super();
    }
    
    public AuthInterceptor() {
        super();
    }
}