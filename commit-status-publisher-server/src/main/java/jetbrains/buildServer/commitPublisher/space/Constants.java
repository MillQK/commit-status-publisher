package jetbrains.buildServer.commitPublisher.space;

import org.jetbrains.annotations.NotNull;

public class Constants {

  public static final String SPACE_PUBLISHER_ID = "spaceStatusPublisher";
  public static final String SPACE_SERVER_URL = "spaceServerUrl";
  public static final String SPACE_PROJECT_KEY = "spaceProjectKey";
  public static final String SPACE_CLIENT_ID = "spaceClientId";

  // Also need to rename this field in SpaceConnectDescriber via converter
  public static final String SPACE_CLIENT_SECRET = "secure:spaceServiceSecret";
  public static final String SPACE_COMMIT_STATUS_PUBLISHER_DISPLAY_NAME = "spaceCommitStatusPublisherDisplayName";

  public static final String SPACE_CONNECTION_ID = "spaceConnectionId";
  public static final String SPACE_CREDENTIALS_TYPE = "spaceCredentialsType";
  public static final String SPACE_CREDENTIALS_CONNECTION = "spaceCredentialsConnection";
  public static final String SPACE_CREDENTIALS_USER = "spaceCredentialsUser";

  @NotNull
  public String getSpacePublisherId() {
    return SPACE_PUBLISHER_ID;
  }

  @NotNull
  public String getSpaceServerUrl() {
    return SPACE_SERVER_URL;
  }

  @NotNull
  public String getSpaceProjectKey() {
    return SPACE_PROJECT_KEY;
  }

  @NotNull
  public String getSpaceClientId() {
    return SPACE_CLIENT_ID;
  }

  @NotNull
  public String getSpaceClientSecret() { return SPACE_CLIENT_SECRET; }

  @NotNull
  public String getSpaceCommitStatusPublisherDisplayName() {
    return SPACE_COMMIT_STATUS_PUBLISHER_DISPLAY_NAME;
  }

  @NotNull
  public String getSpaceConnectionId() {
    return SPACE_CONNECTION_ID;
  }

  @NotNull
  public String getSpaceCredentialsType() {
    return SPACE_CREDENTIALS_TYPE;
  }

  @NotNull
  public String getSpaceCredentialsConnection() {
    return SPACE_CREDENTIALS_CONNECTION;
  }

  @NotNull
  public String getSpaceCredentialsUser() {
    return SPACE_CREDENTIALS_USER;
  }
}
