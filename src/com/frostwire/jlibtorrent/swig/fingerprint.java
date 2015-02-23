/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class fingerprint {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected fingerprint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(fingerprint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_fingerprint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public fingerprint(String id_string, int major, int minor, int revision, int tag) {
    this(libtorrent_jni.new_fingerprint(id_string, major, minor, revision, tag), true);
  }

  public String to_string() {
    return libtorrent_jni.fingerprint_to_string(swigCPtr, this);
  }

  public void setName(String value) {
    libtorrent_jni.fingerprint_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return libtorrent_jni.fingerprint_name_get(swigCPtr, this);
  }

  public void setMajor_version(int value) {
    libtorrent_jni.fingerprint_major_version_set(swigCPtr, this, value);
  }

  public int getMajor_version() {
    return libtorrent_jni.fingerprint_major_version_get(swigCPtr, this);
  }

  public void setMinor_version(int value) {
    libtorrent_jni.fingerprint_minor_version_set(swigCPtr, this, value);
  }

  public int getMinor_version() {
    return libtorrent_jni.fingerprint_minor_version_get(swigCPtr, this);
  }

  public void setRevision_version(int value) {
    libtorrent_jni.fingerprint_revision_version_set(swigCPtr, this, value);
  }

  public int getRevision_version() {
    return libtorrent_jni.fingerprint_revision_version_get(swigCPtr, this);
  }

  public void setTag_version(int value) {
    libtorrent_jni.fingerprint_tag_version_set(swigCPtr, this, value);
  }

  public int getTag_version() {
    return libtorrent_jni.fingerprint_tag_version_get(swigCPtr, this);
  }

}
