// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cluster.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code PartitionInfo}
 */
public  final class PartitionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PartitionInfo)
    PartitionInfoOrBuilder {
  // Use PartitionInfo.newBuilder() to construct.
  private PartitionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartitionInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PartitionInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              shardInfos_ = com.google.protobuf.MapField.newMapField(
                  ShardInfosDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
            shardInfos = input.readMessage(
                ShardInfosDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            shardInfos_.getMutableMap().put(shardInfos.getKey(), shardInfos.getValue());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.ClusterProto.internal_static_PartitionInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetShardInfos();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.ClusterProto.internal_static_PartitionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.PartitionInfo.class, com.alibaba.maxgraph.proto.PartitionInfo.Builder.class);
  }

  public static final int SHARDINFOS_FIELD_NUMBER = 1;
  private static final class ShardInfosDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                com.alibaba.maxgraph.proto.ClusterProto.internal_static_PartitionInfo_ShardInfosEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.ENUM,
                com.alibaba.maxgraph.proto.ShardState.CREATED.getNumber());
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Integer> shardInfos_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
  internalGetShardInfos() {
    if (shardInfos_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ShardInfosDefaultEntryHolder.defaultEntry);
    }
    return shardInfos_;
  }
  private static final
  com.google.protobuf.Internal.MapAdapter.Converter<
      java.lang.Integer, com.alibaba.maxgraph.proto.ShardState> shardInfosValueConverter =
          com.google.protobuf.Internal.MapAdapter.newEnumConverter(
              com.alibaba.maxgraph.proto.ShardState.internalGetValueMap(),
              com.alibaba.maxgraph.proto.ShardState.UNRECOGNIZED);

  public int getShardInfosCount() {
    return internalGetShardInfos().getMap().size();
  }
  /**
   * <pre>
   * serverID : STATE
   * </pre>
   *
   * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
   */

  public boolean containsShardInfos(
      int key) {
    
    return internalGetShardInfos().getMap().containsKey(key);
  }
  /**
   * Use {@link #getShardInfosMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, com.alibaba.maxgraph.proto.ShardState>
  getShardInfos() {
    return getShardInfosMap();
  }
  /**
   * <pre>
   * serverID : STATE
   * </pre>
   *
   * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
   */

  public java.util.Map<java.lang.Integer, com.alibaba.maxgraph.proto.ShardState>
  getShardInfosMap() {
    return new com.google.protobuf.Internal.MapAdapter<
        java.lang.Integer, com.alibaba.maxgraph.proto.ShardState, java.lang.Integer>(
            internalGetShardInfos().getMap(),
            shardInfosValueConverter);
  }
  /**
   * <pre>
   * serverID : STATE
   * </pre>
   *
   * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
   */

  public com.alibaba.maxgraph.proto.ShardState getShardInfosOrDefault(
      int key,
      com.alibaba.maxgraph.proto.ShardState defaultValue) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetShardInfos().getMap();
    return map.containsKey(key)
           ? shardInfosValueConverter.doForward(map.get(key))
           : defaultValue;
  }
  /**
   * <pre>
   * serverID : STATE
   * </pre>
   *
   * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
   */

  public com.alibaba.maxgraph.proto.ShardState getShardInfosOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetShardInfos().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return shardInfosValueConverter.doForward(map.get(key));
  }
  /**
   * Use {@link #getShardInfosValueMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Integer>
  getShardInfosValue() {
    return getShardInfosValueMap();
  }
  /**
   * <pre>
   * serverID : STATE
   * </pre>
   *
   * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
   */

  public java.util.Map<java.lang.Integer, java.lang.Integer>
  getShardInfosValueMap() {
    return internalGetShardInfos().getMap();
  }
  /**
   * <pre>
   * serverID : STATE
   * </pre>
   *
   * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
   */

  public int getShardInfosValueOrDefault(
      int key,
      int defaultValue) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetShardInfos().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * serverID : STATE
   * </pre>
   *
   * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
   */

  public int getShardInfosValueOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, java.lang.Integer> map =
        internalGetShardInfos().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
         : internalGetShardInfos().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
      shardInfos = ShardInfosDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      output.writeMessage(1, shardInfos);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
         : internalGetShardInfos().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
      shardInfos = ShardInfosDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, shardInfos);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.maxgraph.proto.PartitionInfo)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.PartitionInfo other = (com.alibaba.maxgraph.proto.PartitionInfo) obj;

    boolean result = true;
    result = result && internalGetShardInfos().equals(
        other.internalGetShardInfos());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (!internalGetShardInfos().getMap().isEmpty()) {
      hash = (37 * hash) + SHARDINFOS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetShardInfos().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.PartitionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.PartitionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.PartitionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.PartitionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.PartitionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.PartitionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.PartitionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.PartitionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.PartitionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.PartitionInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alibaba.maxgraph.proto.PartitionInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code PartitionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PartitionInfo)
      com.alibaba.maxgraph.proto.PartitionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.ClusterProto.internal_static_PartitionInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetShardInfos();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableShardInfos();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.ClusterProto.internal_static_PartitionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.PartitionInfo.class, com.alibaba.maxgraph.proto.PartitionInfo.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.PartitionInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      internalGetMutableShardInfos().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.ClusterProto.internal_static_PartitionInfo_descriptor;
    }

    public com.alibaba.maxgraph.proto.PartitionInfo getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.PartitionInfo.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.PartitionInfo build() {
      com.alibaba.maxgraph.proto.PartitionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.PartitionInfo buildPartial() {
      com.alibaba.maxgraph.proto.PartitionInfo result = new com.alibaba.maxgraph.proto.PartitionInfo(this);
      int from_bitField0_ = bitField0_;
      result.shardInfos_ = internalGetShardInfos();
      result.shardInfos_.makeImmutable();
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.maxgraph.proto.PartitionInfo) {
        return mergeFrom((com.alibaba.maxgraph.proto.PartitionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.PartitionInfo other) {
      if (other == com.alibaba.maxgraph.proto.PartitionInfo.getDefaultInstance()) return this;
      internalGetMutableShardInfos().mergeFrom(
          other.internalGetShardInfos());
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alibaba.maxgraph.proto.PartitionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.PartitionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> shardInfos_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetShardInfos() {
      if (shardInfos_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ShardInfosDefaultEntryHolder.defaultEntry);
      }
      return shardInfos_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetMutableShardInfos() {
      onChanged();;
      if (shardInfos_ == null) {
        shardInfos_ = com.google.protobuf.MapField.newMapField(
            ShardInfosDefaultEntryHolder.defaultEntry);
      }
      if (!shardInfos_.isMutable()) {
        shardInfos_ = shardInfos_.copy();
      }
      return shardInfos_;
    }

    public int getShardInfosCount() {
      return internalGetShardInfos().getMap().size();
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */

    public boolean containsShardInfos(
        int key) {
      
      return internalGetShardInfos().getMap().containsKey(key);
    }
    /**
     * Use {@link #getShardInfosMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.alibaba.maxgraph.proto.ShardState>
    getShardInfos() {
      return getShardInfosMap();
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */

    public java.util.Map<java.lang.Integer, com.alibaba.maxgraph.proto.ShardState>
    getShardInfosMap() {
      return new com.google.protobuf.Internal.MapAdapter<
          java.lang.Integer, com.alibaba.maxgraph.proto.ShardState, java.lang.Integer>(
              internalGetShardInfos().getMap(),
              shardInfosValueConverter);
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */

    public com.alibaba.maxgraph.proto.ShardState getShardInfosOrDefault(
        int key,
        com.alibaba.maxgraph.proto.ShardState defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetShardInfos().getMap();
      return map.containsKey(key)
             ? shardInfosValueConverter.doForward(map.get(key))
             : defaultValue;
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */

    public com.alibaba.maxgraph.proto.ShardState getShardInfosOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetShardInfos().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return shardInfosValueConverter.doForward(map.get(key));
    }
    /**
     * Use {@link #getShardInfosValueMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer>
    getShardInfosValue() {
      return getShardInfosValueMap();
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */

    public java.util.Map<java.lang.Integer, java.lang.Integer>
    getShardInfosValueMap() {
      return internalGetShardInfos().getMap();
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */

    public int getShardInfosValueOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetShardInfos().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */

    public int getShardInfosValueOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetShardInfos().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearShardInfos() {
      getMutableShardInfos().clear();
      return this;
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */

    public Builder removeShardInfos(
        int key) {
      
      getMutableShardInfos().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.alibaba.maxgraph.proto.ShardState>
    getMutableShardInfos() {
      return new com.google.protobuf.Internal.MapAdapter<
          java.lang.Integer, com.alibaba.maxgraph.proto.ShardState, java.lang.Integer>(
              internalGetMutableShardInfos().getMutableMap(),
              shardInfosValueConverter);
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */
    public Builder putShardInfos(
        int key,
        com.alibaba.maxgraph.proto.ShardState value) {
      
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableShardInfos().put(key, value);
      return this;
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */
    public Builder putAllShardInfos(
        java.util.Map<java.lang.Integer, com.alibaba.maxgraph.proto.ShardState> values) {
      getMutableShardInfos().putAll(values);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer>
    getMutableShardInfosValue() {
      return internalGetMutableShardInfos().getMutableMap();
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */
    public Builder putShardInfosValue(
        int key,
        int value) {
      
      if (com.alibaba.maxgraph.proto.ShardState.forNumber(value) == null) {
        throw new java.lang.IllegalArgumentException();
      }
      getMutableShardInfosValue().put(key, value);
      return this;
    }
    /**
     * <pre>
     * serverID : STATE
     * </pre>
     *
     * <code>map&lt;int32, .ShardState&gt; shardInfos = 1;</code>
     */
    public Builder putAllShardInfosValue(
        java.util.Map<java.lang.Integer, java.lang.Integer> values) {
      getMutableShardInfosValue().putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:PartitionInfo)
  }

  // @@protoc_insertion_point(class_scope:PartitionInfo)
  private static final com.alibaba.maxgraph.proto.PartitionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.PartitionInfo();
  }

  public static com.alibaba.maxgraph.proto.PartitionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartitionInfo>
      PARSER = new com.google.protobuf.AbstractParser<PartitionInfo>() {
    public PartitionInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PartitionInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartitionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartitionInfo> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.PartitionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

