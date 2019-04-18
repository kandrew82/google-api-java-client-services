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

package com.google.api.services.people.v1.model;

/**
 * A Google contact group membership.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContactGroupMembership extends com.google.api.client.json.GenericJson {

  /**
   * The read-only contact group ID for the contact group membership.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contactGroupId;

  /**
   * The resource name for the contact group, assigned by the server. An ASCII string, in the form
   * of `contactGroups/`contact_group_id. Only contact_group_resource_name can be used for modifying
   * memberships. Any contact group membership can be removed, but only user group or "myContacts"
   * or "starred" system groups memberships can be added.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contactGroupResourceName;

  /**
   * The read-only contact group ID for the contact group membership.
   * @return value or {@code null} for none
   */
  public java.lang.String getContactGroupId() {
    return contactGroupId;
  }

  /**
   * The read-only contact group ID for the contact group membership.
   * @param contactGroupId contactGroupId or {@code null} for none
   */
  public ContactGroupMembership setContactGroupId(java.lang.String contactGroupId) {
    this.contactGroupId = contactGroupId;
    return this;
  }

  /**
   * The resource name for the contact group, assigned by the server. An ASCII string, in the form
   * of `contactGroups/`contact_group_id. Only contact_group_resource_name can be used for modifying
   * memberships. Any contact group membership can be removed, but only user group or "myContacts"
   * or "starred" system groups memberships can be added.
   * @return value or {@code null} for none
   */
  public java.lang.String getContactGroupResourceName() {
    return contactGroupResourceName;
  }

  /**
   * The resource name for the contact group, assigned by the server. An ASCII string, in the form
   * of `contactGroups/`contact_group_id. Only contact_group_resource_name can be used for modifying
   * memberships. Any contact group membership can be removed, but only user group or "myContacts"
   * or "starred" system groups memberships can be added.
   * @param contactGroupResourceName contactGroupResourceName or {@code null} for none
   */
  public ContactGroupMembership setContactGroupResourceName(java.lang.String contactGroupResourceName) {
    this.contactGroupResourceName = contactGroupResourceName;
    return this;
  }

  @Override
  public ContactGroupMembership set(String fieldName, Object value) {
    return (ContactGroupMembership) super.set(fieldName, value);
  }

  @Override
  public ContactGroupMembership clone() {
    return (ContactGroupMembership) super.clone();
  }

}
