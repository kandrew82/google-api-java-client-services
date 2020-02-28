/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.managedidentities.v1alpha1.model;

/**
 * This message has been deprecated. RolloutMetadata for an actuation instance. It maps to a single
 * RolloutType.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Instance level notification metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata notification;

  /**
   * The last Release that has been applied to the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String releaseName;

  /**
   * The last rollout that has been applied to the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rolloutName;

  /**
   * Instance level notification metadata.
   * @return value or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata getNotification() {
    return notification;
  }

  /**
   * Instance level notification metadata.
   * @param notification notification or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata setNotification(GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata notification) {
    this.notification = notification;
    return this;
  }

  /**
   * The last Release that has been applied to the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getReleaseName() {
    return releaseName;
  }

  /**
   * The last Release that has been applied to the instance.
   * @param releaseName releaseName or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata setReleaseName(java.lang.String releaseName) {
    this.releaseName = releaseName;
    return this;
  }

  /**
   * The last rollout that has been applied to the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getRolloutName() {
    return rolloutName;
  }

  /**
   * The last rollout that has been applied to the instance.
   * @param rolloutName rolloutName or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata setRolloutName(java.lang.String rolloutName) {
    this.rolloutName = rolloutName;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata) super.clone();
  }

}
