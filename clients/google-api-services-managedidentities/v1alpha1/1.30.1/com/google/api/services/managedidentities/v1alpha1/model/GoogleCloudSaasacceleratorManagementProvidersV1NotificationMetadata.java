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
 * This message has been deprecated. NotificationMetadata is the notification state for an instance.
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
public final class GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Whether the instance update has been rescheduled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean rescheduled;

  /**
   * The scheduled end time for the maintenance window during which update can be performed on the
   * instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduledEndTime;

  /**
   * The scheduled start time for the maintenance window during which update can be performed on the
   * instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduledStartTime;

  /**
   * The target release to be applied to the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetRelease;

  /**
   * Whether the instance update has been rescheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRescheduled() {
    return rescheduled;
  }

  /**
   * Whether the instance update has been rescheduled.
   * @param rescheduled rescheduled or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata setRescheduled(java.lang.Boolean rescheduled) {
    this.rescheduled = rescheduled;
    return this;
  }

  /**
   * The scheduled end time for the maintenance window during which update can be performed on the
   * instance.
   * @return value or {@code null} for none
   */
  public String getScheduledEndTime() {
    return scheduledEndTime;
  }

  /**
   * The scheduled end time for the maintenance window during which update can be performed on the
   * instance.
   * @param scheduledEndTime scheduledEndTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata setScheduledEndTime(String scheduledEndTime) {
    this.scheduledEndTime = scheduledEndTime;
    return this;
  }

  /**
   * The scheduled start time for the maintenance window during which update can be performed on the
   * instance.
   * @return value or {@code null} for none
   */
  public String getScheduledStartTime() {
    return scheduledStartTime;
  }

  /**
   * The scheduled start time for the maintenance window during which update can be performed on the
   * instance.
   * @param scheduledStartTime scheduledStartTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata setScheduledStartTime(String scheduledStartTime) {
    this.scheduledStartTime = scheduledStartTime;
    return this;
  }

  /**
   * The target release to be applied to the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetRelease() {
    return targetRelease;
  }

  /**
   * The target release to be applied to the instance.
   * @param targetRelease targetRelease or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata setTargetRelease(java.lang.String targetRelease) {
    this.targetRelease = targetRelease;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1NotificationMetadata) super.clone();
  }

}
