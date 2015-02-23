/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class proxy_settings {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected proxy_settings(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(proxy_settings obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_proxy_settings(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public proxy_settings() {
    this(libtorrent_jni.new_proxy_settings(), true);
  }

  public void setHostname(String value) {
    libtorrent_jni.proxy_settings_hostname_set(swigCPtr, this, value);
  }

  public String getHostname() {
    return libtorrent_jni.proxy_settings_hostname_get(swigCPtr, this);
  }

  public void setUsername(String value) {
    libtorrent_jni.proxy_settings_username_set(swigCPtr, this, value);
  }

  public String getUsername() {
    return libtorrent_jni.proxy_settings_username_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    libtorrent_jni.proxy_settings_password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return libtorrent_jni.proxy_settings_password_get(swigCPtr, this);
  }

  public void setType(short value) {
    libtorrent_jni.proxy_settings_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return libtorrent_jni.proxy_settings_type_get(swigCPtr, this);
  }

  public void setPort(int value) {
    libtorrent_jni.proxy_settings_port_set(swigCPtr, this, value);
  }

  public int getPort() {
    return libtorrent_jni.proxy_settings_port_get(swigCPtr, this);
  }

  public void setProxy_hostnames(boolean value) {
    libtorrent_jni.proxy_settings_proxy_hostnames_set(swigCPtr, this, value);
  }

  public boolean getProxy_hostnames() {
    return libtorrent_jni.proxy_settings_proxy_hostnames_get(swigCPtr, this);
  }

  public void setProxy_peer_connections(boolean value) {
    libtorrent_jni.proxy_settings_proxy_peer_connections_set(swigCPtr, this, value);
  }

  public boolean getProxy_peer_connections() {
    return libtorrent_jni.proxy_settings_proxy_peer_connections_get(swigCPtr, this);
  }

  public enum proxy_type {
    none,
    socks4,
    socks5,
    socks5_pw,
    http,
    http_pw,
    i2p_proxy;

    public final int swigValue() {
      return swigValue;
    }

    public static proxy_type swigToEnum(int swigValue) {
      proxy_type[] swigValues = proxy_type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (proxy_type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + proxy_type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private proxy_type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private proxy_type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private proxy_type(proxy_type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
