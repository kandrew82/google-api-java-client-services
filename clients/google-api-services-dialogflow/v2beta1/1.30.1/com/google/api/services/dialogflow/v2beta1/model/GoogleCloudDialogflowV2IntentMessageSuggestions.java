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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * The collection of suggestions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentMessageSuggestions extends com.google.api.client.json.GenericJson {

  /**
   * Required. The list of suggested replies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentMessageSuggestion> suggestions;

  static {
    // hack to force ProGuard to consider GoogleCloudDialogflowV2IntentMessageSuggestion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDialogflowV2IntentMessageSuggestion.class);
  }

  /**
   * Required. The list of suggested replies.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentMessageSuggestion> getSuggestions() {
    return suggestions;
  }

  /**
   * Required. The list of suggested replies.
   * @param suggestions suggestions or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageSuggestions setSuggestions(java.util.List<GoogleCloudDialogflowV2IntentMessageSuggestion> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageSuggestions set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentMessageSuggestions) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageSuggestions clone() {
    return (GoogleCloudDialogflowV2IntentMessageSuggestions) super.clone();
  }

}
