package com.akash.userservice.security.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.Instant;


@Entity
@Table(name = "authorization")
public class Authorization {
    @Id
    @Column
    private String id;
    private String registeredClientId;
    private String principalName;
    private String authorizationGrantType;
    @Column(length = 1000)
    @Lob
    private String authorizedScopes;
    @Column(length = 4000)
    @Lob
    private String attributes;
    @Column(length = 500)
    private String state;

    @Column(length = 4000)
    @Lob
    private String authorizationCodeValue;
    private Instant authorizationCodeIssuedAt;
    private Instant authorizationCodeExpiresAt;
    private String authorizationCodeMetadata;

    @Column(length = 4000)
    @Lob
    private String accessTokenValue;
    private Instant accessTokenIssuedAt;
    private Instant accessTokenExpiresAt;
    @Column(length = 2000)
    @Lob
    private String accessTokenMetadata;
    private String accessTokenType;
    @Column(length = 1000)
    @Lob
    private String accessTokenScopes;

    @Column(length = 4000)
    @Lob
    private String refreshTokenValue;
    private Instant refreshTokenIssuedAt;
    private Instant refreshTokenExpiresAt;
    @Column(length = 2000)
    @Lob
    private String refreshTokenMetadata;

    @Column(length = 4000)
    @Lob
    private String oidcIdTokenValue;
    private Instant oidcIdTokenIssuedAt;
    private Instant oidcIdTokenExpiresAt;
    @Column(length = 2000)
    @Lob
    private String oidcIdTokenMetadata;
    @Column(length = 2000)
    @Lob
    private String oidcIdTokenClaims;

    @Column(length = 4000)
    @Lob
    private String userCodeValue;
    private Instant userCodeIssuedAt;
    private Instant userCodeExpiresAt;
    @Column(length = 2000)
    @Lob
    private String userCodeMetadata;

    @Column(length = 4000)
    @Lob
    private String deviceCodeValue;
    private Instant deviceCodeIssuedAt;
    private Instant deviceCodeExpiresAt;
    @Column(length = 2000)
    @Lob
    private String deviceCodeMetadata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegisteredClientId() {
        return registeredClientId;
    }

    public void setRegisteredClientId(String registeredClientId) {
        this.registeredClientId = registeredClientId;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public String getAuthorizationGrantType() {
        return authorizationGrantType;
    }

    public void setAuthorizationGrantType(String authorizationGrantType) {
        this.authorizationGrantType = authorizationGrantType;
    }

    public String getAuthorizedScopes() {
        return authorizedScopes;
    }

    public void setAuthorizedScopes(String authorizedScopes) {
        this.authorizedScopes = authorizedScopes;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAuthorizationCodeValue() {
        return authorizationCodeValue;
    }

    public void setAuthorizationCodeValue(String authorizationCodeValue) {
        this.authorizationCodeValue = authorizationCodeValue;
    }

    public Instant getAuthorizationCodeIssuedAt() {
        return authorizationCodeIssuedAt;
    }

    public void setAuthorizationCodeIssuedAt(Instant authorizationCodeIssuedAt) {
        this.authorizationCodeIssuedAt = authorizationCodeIssuedAt;
    }

    public Instant getAuthorizationCodeExpiresAt() {
        return authorizationCodeExpiresAt;
    }

    public void setAuthorizationCodeExpiresAt(Instant authorizationCodeExpiresAt) {
        this.authorizationCodeExpiresAt = authorizationCodeExpiresAt;
    }

    public String getAuthorizationCodeMetadata() {
        return authorizationCodeMetadata;
    }

    public void setAuthorizationCodeMetadata(String authorizationCodeMetadata) {
        this.authorizationCodeMetadata = authorizationCodeMetadata;
    }

    public String getAccessTokenValue() {
        return accessTokenValue;
    }

    public void setAccessTokenValue(String accessTokenValue) {
        this.accessTokenValue = accessTokenValue;
    }

    public Instant getAccessTokenIssuedAt() {
        return accessTokenIssuedAt;
    }

    public void setAccessTokenIssuedAt(Instant accessTokenIssuedAt) {
        this.accessTokenIssuedAt = accessTokenIssuedAt;
    }

    public Instant getAccessTokenExpiresAt() {
        return accessTokenExpiresAt;
    }

    public void setAccessTokenExpiresAt(Instant accessTokenExpiresAt) {
        this.accessTokenExpiresAt = accessTokenExpiresAt;
    }

    public String getAccessTokenMetadata() {
        return accessTokenMetadata;
    }

    public void setAccessTokenMetadata(String accessTokenMetadata) {
        this.accessTokenMetadata = accessTokenMetadata;
    }

    public String getAccessTokenType() {
        return accessTokenType;
    }

    public void setAccessTokenType(String accessTokenType) {
        this.accessTokenType = accessTokenType;
    }

    public String getAccessTokenScopes() {
        return accessTokenScopes;
    }

    public void setAccessTokenScopes(String accessTokenScopes) {
        this.accessTokenScopes = accessTokenScopes;
    }

    public String getRefreshTokenValue() {
        return refreshTokenValue;
    }

    public void setRefreshTokenValue(String refreshTokenValue) {
        this.refreshTokenValue = refreshTokenValue;
    }

    public Instant getRefreshTokenIssuedAt() {
        return refreshTokenIssuedAt;
    }

    public void setRefreshTokenIssuedAt(Instant refreshTokenIssuedAt) {
        this.refreshTokenIssuedAt = refreshTokenIssuedAt;
    }

    public Instant getRefreshTokenExpiresAt() {
        return refreshTokenExpiresAt;
    }

    public void setRefreshTokenExpiresAt(Instant refreshTokenExpiresAt) {
        this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    }

    public String getRefreshTokenMetadata() {
        return refreshTokenMetadata;
    }

    public void setRefreshTokenMetadata(String refreshTokenMetadata) {
        this.refreshTokenMetadata = refreshTokenMetadata;
    }

    public String getOidcIdTokenValue() {
        return oidcIdTokenValue;
    }

    public void setOidcIdTokenValue(String oidcIdTokenValue) {
        this.oidcIdTokenValue = oidcIdTokenValue;
    }

    public Instant getOidcIdTokenIssuedAt() {
        return oidcIdTokenIssuedAt;
    }

    public void setOidcIdTokenIssuedAt(Instant oidcIdTokenIssuedAt) {
        this.oidcIdTokenIssuedAt = oidcIdTokenIssuedAt;
    }

    public Instant getOidcIdTokenExpiresAt() {
        return oidcIdTokenExpiresAt;
    }

    public void setOidcIdTokenExpiresAt(Instant oidcIdTokenExpiresAt) {
        this.oidcIdTokenExpiresAt = oidcIdTokenExpiresAt;
    }

    public String getOidcIdTokenMetadata() {
        return oidcIdTokenMetadata;
    }

    public void setOidcIdTokenMetadata(String oidcIdTokenMetadata) {
        this.oidcIdTokenMetadata = oidcIdTokenMetadata;
    }

    public String getOidcIdTokenClaims() {
        return oidcIdTokenClaims;
    }

    public void setOidcIdTokenClaims(String oidcIdTokenClaims) {
        this.oidcIdTokenClaims = oidcIdTokenClaims;
    }

    public String getUserCodeValue() {
        return userCodeValue;
    }

    public void setUserCodeValue(String userCodeValue) {
        this.userCodeValue = userCodeValue;
    }

    public Instant getUserCodeIssuedAt() {
        return userCodeIssuedAt;
    }

    public void setUserCodeIssuedAt(Instant userCodeIssuedAt) {
        this.userCodeIssuedAt = userCodeIssuedAt;
    }

    public Instant getUserCodeExpiresAt() {
        return userCodeExpiresAt;
    }

    public void setUserCodeExpiresAt(Instant userCodeExpiresAt) {
        this.userCodeExpiresAt = userCodeExpiresAt;
    }

    public String getUserCodeMetadata() {
        return userCodeMetadata;
    }

    public void setUserCodeMetadata(String userCodeMetadata) {
        this.userCodeMetadata = userCodeMetadata;
    }

    public String getDeviceCodeValue() {
        return deviceCodeValue;
    }

    public void setDeviceCodeValue(String deviceCodeValue) {
        this.deviceCodeValue = deviceCodeValue;
    }

    public Instant getDeviceCodeIssuedAt() {
        return deviceCodeIssuedAt;
    }

    public void setDeviceCodeIssuedAt(Instant deviceCodeIssuedAt) {
        this.deviceCodeIssuedAt = deviceCodeIssuedAt;
    }

    public Instant getDeviceCodeExpiresAt() {
        return deviceCodeExpiresAt;
    }

    public void setDeviceCodeExpiresAt(Instant deviceCodeExpiresAt) {
        this.deviceCodeExpiresAt = deviceCodeExpiresAt;
    }

    public String getDeviceCodeMetadata() {
        return deviceCodeMetadata;
    }

    public void setDeviceCodeMetadata(String deviceCodeMetadata) {
        this.deviceCodeMetadata = deviceCodeMetadata;
    }

    //    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setRegisteredClientId(String registeredClientId) {
//        this.registeredClientId = registeredClientId;
//    }
//
//    public void setPrincipalName(String principalName) {
//        this.principalName = principalName;
//    }
//
//    public void setAuthorizationGrantType(String authorizationGrantType) {
//        this.authorizationGrantType = authorizationGrantType;
//    }
//
//    public void setAuthorizedScopes(String authorizedScopes) {
//        this.authorizedScopes = authorizedScopes;
//    }
//
//    public void setAttributes(String attributes) {
//        this.attributes = attributes;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public void setAuthorizationCodeValue(String authorizationCode) {
//        this.authorizationCodeValue = authorizationCode;
//    }
//
//    public void setAuthorizationCodeIssuedAt(Instant authorizationCodeIssuedAt) {
//        this.authorizationCodeIssuedAt = authorizationCodeIssuedAt;
//    }
//
//    public void setAuthorizationCodeExpiresAt(Instant authorizationCodeExpiresAt) {
//        this.authorizationCodeExpiresAt = authorizationCodeExpiresAt;
//    }
//
//    public void setAuthorizationCodeMetadata(String authorizationCodeMetadata) {
//        this.authorizationCodeMetadata = authorizationCodeMetadata;
//    }
//
//    public void setAccessTokenValue(String accessToken) {
//        this.accessTokenValue = accessToken;
//    }
//
//    public void setAccessTokenIssuedAt(Instant accessTokenIssuedAt) {
//        this.accessTokenIssuedAt = accessTokenIssuedAt;
//    }
//
//    public void setAccessTokenExpiresAt(Instant accessTokenExpiresAt) {
//        this.accessTokenExpiresAt = accessTokenExpiresAt;
//    }
//
//    public void setAccessTokenMetadata(String accessTokenMetadata) {
//        this.accessTokenMetadata = accessTokenMetadata;
//    }
//
//    public void setAccessTokenType(String accessTokenType) {
//        this.accessTokenType = accessTokenType;
//    }
//
//    public void setAccessTokenScopes(String accessTokenScopes) {
//        this.accessTokenScopes = accessTokenScopes;
//    }
//
//    public void setRefreshTokenValue(String refreshToken) {
//        this.refreshTokenValue = refreshToken;
//    }
//
//    public void setRefreshTokenIssuedAt(Instant refreshTokenIssuedAt) {
//        this.refreshTokenIssuedAt = refreshTokenIssuedAt;
//    }
//
//    public void setRefreshTokenExpiresAt(Instant refreshTokenExpiresAt) {
//        this.refreshTokenExpiresAt = refreshTokenExpiresAt;
//    }
//
//    public void setRefreshTokenMetadata(String refreshTokenMetadata) {
//        this.refreshTokenMetadata = refreshTokenMetadata;
//    }
//
//    public void setOidcIdTokenValue(String idToken) {
//        this.oidcIdTokenValue = idToken;
//    }
//
//    public void setOidcIdTokenIssuedAt(Instant idTokenIssuedAt) {
//        this.oidcIdTokenIssuedAt = idTokenIssuedAt;
//    }
//
//    public void setOidcIdTokenExpiresAt(Instant idTokenExpiresAt) {
//        this.oidcIdTokenExpiresAt = idTokenExpiresAt;
//    }
//
//    public void setOidcIdTokenMetadata(String idTokenMetadata) {
//        this.oidcIdTokenMetadata = idTokenMetadata;
//    }
//
//    public void setOidcIdTokenClaims(String idTokenClaims) {
//        this.oidcIdTokenClaims = idTokenClaims;
//    }
//
//    public void setUserCodeValue(String userCodeValue) {
//        this.userCodeValue = userCodeValue;
//    }
//
//    public void setUserCodeIssuedAt(Instant userCodeIssuedAt) {
//        this.userCodeIssuedAt = userCodeIssuedAt;
//    }
//
//    public void setUserCodeExpiresAt(Instant userCodeExpiresAt) {
//        this.userCodeExpiresAt = userCodeExpiresAt;
//    }
//
//    public void setUserCodeMetadata(String userCodeMetadata) {
//        this.userCodeMetadata = userCodeMetadata;
//    }
//
//    public void setDeviceCodeValue(String deviceCodeValue) {
//        this.deviceCodeValue = deviceCodeValue;
//    }
//
//    public void setDeviceCodeIssuedAt(Instant deviceCodeIssuedAt) {
//        this.deviceCodeIssuedAt = deviceCodeIssuedAt;
//    }
//
//    public void setDeviceCodeExpiresAt(Instant deviceCodeExpiresAt) {
//        this.deviceCodeExpiresAt = deviceCodeExpiresAt;
//    }
//
//    public void setDeviceCodeMetadata(String deviceCodeMetadata) {
//        this.deviceCodeMetadata = deviceCodeMetadata;
//    }
}