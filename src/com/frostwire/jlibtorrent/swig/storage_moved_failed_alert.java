/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class storage_moved_failed_alert extends torrent_alert {
  private long swigCPtr;

  protected storage_moved_failed_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.storage_moved_failed_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(storage_moved_failed_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_storage_moved_failed_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public storage_moved_failed_alert(torrent_handle h, error_code e) {
    this(libtorrent_jni.new_storage_moved_failed_alert(torrent_handle.getCPtr(h), h, error_code.getCPtr(e), e), true);
  }

  public int type() {
    return libtorrent_jni.storage_moved_failed_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.storage_moved_failed_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.storage_moved_failed_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.storage_moved_failed_alert_message(swigCPtr, this);
  }

  public void setError(error_code value) {
    libtorrent_jni.storage_moved_failed_alert_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.storage_moved_failed_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public final static int alert_type = libtorrent_jni.storage_moved_failed_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.storage_moved_failed_alert_static_category_get();
}
