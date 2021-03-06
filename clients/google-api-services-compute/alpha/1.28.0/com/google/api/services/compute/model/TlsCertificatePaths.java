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

package com.google.api.services.compute.model;

/**
 * The paths to the mounted TLS Certificates and private key.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TlsCertificatePaths extends com.google.api.client.json.GenericJson {

  /**
   * The path to the file holding the client or server TLS certificate to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificatePath;

  /**
   * The path to the file holding the client or server private key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateKeyPath;

  /**
   * The path to the file holding the client or server TLS certificate to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificatePath() {
    return certificatePath;
  }

  /**
   * The path to the file holding the client or server TLS certificate to use.
   * @param certificatePath certificatePath or {@code null} for none
   */
  public TlsCertificatePaths setCertificatePath(java.lang.String certificatePath) {
    this.certificatePath = certificatePath;
    return this;
  }

  /**
   * The path to the file holding the client or server private key.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateKeyPath() {
    return privateKeyPath;
  }

  /**
   * The path to the file holding the client or server private key.
   * @param privateKeyPath privateKeyPath or {@code null} for none
   */
  public TlsCertificatePaths setPrivateKeyPath(java.lang.String privateKeyPath) {
    this.privateKeyPath = privateKeyPath;
    return this;
  }

  @Override
  public TlsCertificatePaths set(String fieldName, Object value) {
    return (TlsCertificatePaths) super.set(fieldName, value);
  }

  @Override
  public TlsCertificatePaths clone() {
    return (TlsCertificatePaths) super.clone();
  }

}
