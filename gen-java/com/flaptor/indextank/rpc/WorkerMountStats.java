/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.flaptor.indextank.rpc;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

@SuppressWarnings("all") public class WorkerMountStats implements TBase<WorkerMountStats, WorkerMountStats._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("WorkerMountStats");

  private static final TField FS_SIZES_FIELD_DESC = new TField("fs_sizes", TType.MAP, (short)1);

  private Map<String,List<Integer>> fs_sizes;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    FS_SIZES((short)1, "fs_sizes");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FS_SIZES
          return FS_SIZES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FS_SIZES, new FieldMetaData("fs_sizes", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new ListMetaData(TType.LIST, 
                new FieldValueMetaData(TType.I32)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(WorkerMountStats.class, metaDataMap);
  }

  public WorkerMountStats() {
  }

  public WorkerMountStats(
    Map<String,List<Integer>> fs_sizes)
  {
    this();
    this.fs_sizes = fs_sizes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WorkerMountStats(WorkerMountStats other) {
    if (other.is_set_fs_sizes()) {
      Map<String,List<Integer>> __this__fs_sizes = new HashMap<String,List<Integer>>();
      for (Map.Entry<String, List<Integer>> other_element : other.fs_sizes.entrySet()) {

        String other_element_key = other_element.getKey();
        List<Integer> other_element_value = other_element.getValue();

        String __this__fs_sizes_copy_key = other_element_key;

        List<Integer> __this__fs_sizes_copy_value = new ArrayList<Integer>();
        for (Integer other_element_value_element : other_element_value) {
          __this__fs_sizes_copy_value.add(other_element_value_element);
        }

        __this__fs_sizes.put(__this__fs_sizes_copy_key, __this__fs_sizes_copy_value);
      }
      this.fs_sizes = __this__fs_sizes;
    }
  }

  public WorkerMountStats deepCopy() {
    return new WorkerMountStats(this);
  }

  @Override
  public void clear() {
    this.fs_sizes = null;
  }

  public int get_fs_sizes_size() {
    return (this.fs_sizes == null) ? 0 : this.fs_sizes.size();
  }

  public void put_to_fs_sizes(String key, List<Integer> val) {
    if (this.fs_sizes == null) {
      this.fs_sizes = new HashMap<String,List<Integer>>();
    }
    this.fs_sizes.put(key, val);
  }

  public Map<String,List<Integer>> get_fs_sizes() {
    return this.fs_sizes;
  }

  public WorkerMountStats set_fs_sizes(Map<String,List<Integer>> fs_sizes) {
    this.fs_sizes = fs_sizes;
    return this;
  }

  public void unset_fs_sizes() {
    this.fs_sizes = null;
  }

  /** Returns true if field fs_sizes is set (has been asigned a value) and false otherwise */
  public boolean is_set_fs_sizes() {
    return this.fs_sizes != null;
  }

  public void set_fs_sizes_isSet(boolean value) {
    if (!value) {
      this.fs_sizes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FS_SIZES:
      if (value == null) {
        unset_fs_sizes();
      } else {
        set_fs_sizes((Map<String,List<Integer>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FS_SIZES:
      return get_fs_sizes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FS_SIZES:
      return is_set_fs_sizes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WorkerMountStats)
      return this.equals((WorkerMountStats)that);
    return false;
  }

  public boolean equals(WorkerMountStats that) {
    if (that == null)
      return false;

    boolean this_present_fs_sizes = true && this.is_set_fs_sizes();
    boolean that_present_fs_sizes = true && that.is_set_fs_sizes();
    if (this_present_fs_sizes || that_present_fs_sizes) {
      if (!(this_present_fs_sizes && that_present_fs_sizes))
        return false;
      if (!this.fs_sizes.equals(that.fs_sizes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(WorkerMountStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    WorkerMountStats typedOther = (WorkerMountStats)other;

    lastComparison = Boolean.valueOf(is_set_fs_sizes()).compareTo(typedOther.is_set_fs_sizes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_fs_sizes()) {
      lastComparison = TBaseHelper.compareTo(this.fs_sizes, typedOther.fs_sizes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // FS_SIZES
          if (field.type == TType.MAP) {
            {
              TMap _map50 = iprot.readMapBegin();
              this.fs_sizes = new HashMap<String,List<Integer>>(2*_map50.size);
              for (int _i51 = 0; _i51 < _map50.size; ++_i51)
              {
                String _key52;
                List<Integer> _val53;
                _key52 = iprot.readString();
                {
                  TList _list54 = iprot.readListBegin();
                  _val53 = new ArrayList<Integer>(_list54.size);
                  for (int _i55 = 0; _i55 < _list54.size; ++_i55)
                  {
                    int _elem56;
                    _elem56 = iprot.readI32();
                    _val53.add(_elem56);
                  }
                  iprot.readListEnd();
                }
                this.fs_sizes.put(_key52, _val53);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.fs_sizes != null) {
      oprot.writeFieldBegin(FS_SIZES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.LIST, this.fs_sizes.size()));
        for (Map.Entry<String, List<Integer>> _iter57 : this.fs_sizes.entrySet())
        {
          oprot.writeString(_iter57.getKey());
          {
            oprot.writeListBegin(new TList(TType.I32, _iter57.getValue().size()));
            for (int _iter58 : _iter57.getValue())
            {
              oprot.writeI32(_iter58);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WorkerMountStats(");
    boolean first = true;

    sb.append("fs_sizes:");
    if (this.fs_sizes == null) {
      sb.append("null");
    } else {
      sb.append(this.fs_sizes);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

