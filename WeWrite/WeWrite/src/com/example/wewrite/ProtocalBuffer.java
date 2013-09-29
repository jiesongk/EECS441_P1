// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeWrite.proto

package com.example.wewrite;

public final class ProtocalBuffer {
  private ProtocalBuffer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EventsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 globalStart = 1;
    /**
     * <code>required int32 globalStart = 1;</code>
     */
    boolean hasGlobalStart();
    /**
     * <code>required int32 globalStart = 1;</code>
     */
    int getGlobalStart();

    // required int32 removeLength = 2;
    /**
     * <code>required int32 removeLength = 2;</code>
     */
    boolean hasRemoveLength();
    /**
     * <code>required int32 removeLength = 2;</code>
     */
    int getRemoveLength();

    // required int32 insertLength = 3;
    /**
     * <code>required int32 insertLength = 3;</code>
     */
    boolean hasInsertLength();
    /**
     * <code>required int32 insertLength = 3;</code>
     */
    int getInsertLength();

    // required string insertCharacters = 4;
    /**
     * <code>required string insertCharacters = 4;</code>
     */
    boolean hasInsertCharacters();
    /**
     * <code>required string insertCharacters = 4;</code>
     */
    java.lang.String getInsertCharacters();
    /**
     * <code>required string insertCharacters = 4;</code>
     */
    com.google.protobuf.ByteString
        getInsertCharactersBytes();

    // required string removeCharacters = 5;
    /**
     * <code>required string removeCharacters = 5;</code>
     */
    boolean hasRemoveCharacters();
    /**
     * <code>required string removeCharacters = 5;</code>
     */
    java.lang.String getRemoveCharacters();
    /**
     * <code>required string removeCharacters = 5;</code>
     */
    com.google.protobuf.ByteString
        getRemoveCharactersBytes();

    // required string username = 6;
    /**
     * <code>required string username = 6;</code>
     */
    boolean hasUsername();
    /**
     * <code>required string username = 6;</code>
     */
    java.lang.String getUsername();
    /**
     * <code>required string username = 6;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    // required sint32 afterGlobalOrderId = 7;
    /**
     * <code>required sint32 afterGlobalOrderId = 7;</code>
     */
    boolean hasAfterGlobalOrderId();
    /**
     * <code>required sint32 afterGlobalOrderId = 7;</code>
     */
    int getAfterGlobalOrderId();
  }
  /**
   * Protobuf type {@code com.example.wewrite.Events}
   */
  public static final class Events extends
      com.google.protobuf.GeneratedMessage
      implements EventsOrBuilder {
    // Use Events.newBuilder() to construct.
    private Events(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Events(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Events defaultInstance;
    public static Events getDefaultInstance() {
      return defaultInstance;
    }

    public Events getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Events(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              globalStart_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              removeLength_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              insertLength_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              insertCharacters_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              removeCharacters_ = input.readBytes();
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              username_ = input.readBytes();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              afterGlobalOrderId_ = input.readSInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.wewrite.ProtocalBuffer.internal_static_com_example_wewrite_Events_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.wewrite.ProtocalBuffer.internal_static_com_example_wewrite_Events_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.wewrite.ProtocalBuffer.Events.class, com.example.wewrite.ProtocalBuffer.Events.Builder.class);
    }

    public static com.google.protobuf.Parser<Events> PARSER =
        new com.google.protobuf.AbstractParser<Events>() {
      public Events parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Events(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Events> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 globalStart = 1;
    public static final int GLOBALSTART_FIELD_NUMBER = 1;
    private int globalStart_;
    /**
     * <code>required int32 globalStart = 1;</code>
     */
    public boolean hasGlobalStart() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 globalStart = 1;</code>
     */
    public int getGlobalStart() {
      return globalStart_;
    }

    // required int32 removeLength = 2;
    public static final int REMOVELENGTH_FIELD_NUMBER = 2;
    private int removeLength_;
    /**
     * <code>required int32 removeLength = 2;</code>
     */
    public boolean hasRemoveLength() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 removeLength = 2;</code>
     */
    public int getRemoveLength() {
      return removeLength_;
    }

    // required int32 insertLength = 3;
    public static final int INSERTLENGTH_FIELD_NUMBER = 3;
    private int insertLength_;
    /**
     * <code>required int32 insertLength = 3;</code>
     */
    public boolean hasInsertLength() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 insertLength = 3;</code>
     */
    public int getInsertLength() {
      return insertLength_;
    }

    // required string insertCharacters = 4;
    public static final int INSERTCHARACTERS_FIELD_NUMBER = 4;
    private java.lang.Object insertCharacters_;
    /**
     * <code>required string insertCharacters = 4;</code>
     */
    public boolean hasInsertCharacters() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string insertCharacters = 4;</code>
     */
    public java.lang.String getInsertCharacters() {
      java.lang.Object ref = insertCharacters_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          insertCharacters_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string insertCharacters = 4;</code>
     */
    public com.google.protobuf.ByteString
        getInsertCharactersBytes() {
      java.lang.Object ref = insertCharacters_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        insertCharacters_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string removeCharacters = 5;
    public static final int REMOVECHARACTERS_FIELD_NUMBER = 5;
    private java.lang.Object removeCharacters_;
    /**
     * <code>required string removeCharacters = 5;</code>
     */
    public boolean hasRemoveCharacters() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required string removeCharacters = 5;</code>
     */
    public java.lang.String getRemoveCharacters() {
      java.lang.Object ref = removeCharacters_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          removeCharacters_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string removeCharacters = 5;</code>
     */
    public com.google.protobuf.ByteString
        getRemoveCharactersBytes() {
      java.lang.Object ref = removeCharacters_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        removeCharacters_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string username = 6;
    public static final int USERNAME_FIELD_NUMBER = 6;
    private java.lang.Object username_;
    /**
     * <code>required string username = 6;</code>
     */
    public boolean hasUsername() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required string username = 6;</code>
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          username_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string username = 6;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required sint32 afterGlobalOrderId = 7;
    public static final int AFTERGLOBALORDERID_FIELD_NUMBER = 7;
    private int afterGlobalOrderId_;
    /**
     * <code>required sint32 afterGlobalOrderId = 7;</code>
     */
    public boolean hasAfterGlobalOrderId() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required sint32 afterGlobalOrderId = 7;</code>
     */
    public int getAfterGlobalOrderId() {
      return afterGlobalOrderId_;
    }

    private void initFields() {
      globalStart_ = 0;
      removeLength_ = 0;
      insertLength_ = 0;
      insertCharacters_ = "";
      removeCharacters_ = "";
      username_ = "";
      afterGlobalOrderId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasGlobalStart()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRemoveLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasInsertLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasInsertCharacters()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRemoveCharacters()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUsername()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAfterGlobalOrderId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, globalStart_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, removeLength_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, insertLength_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getInsertCharactersBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getRemoveCharactersBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, getUsernameBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeSInt32(7, afterGlobalOrderId_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, globalStart_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, removeLength_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, insertLength_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getInsertCharactersBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getRemoveCharactersBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, getUsernameBytes());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(7, afterGlobalOrderId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.example.wewrite.ProtocalBuffer.Events parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.wewrite.ProtocalBuffer.Events parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.wewrite.ProtocalBuffer.Events parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.wewrite.ProtocalBuffer.Events parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.wewrite.ProtocalBuffer.Events parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.example.wewrite.ProtocalBuffer.Events parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.example.wewrite.ProtocalBuffer.Events parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.example.wewrite.ProtocalBuffer.Events parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.example.wewrite.ProtocalBuffer.Events parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.example.wewrite.ProtocalBuffer.Events parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.example.wewrite.ProtocalBuffer.Events prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.example.wewrite.Events}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.example.wewrite.ProtocalBuffer.EventsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.wewrite.ProtocalBuffer.internal_static_com_example_wewrite_Events_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.wewrite.ProtocalBuffer.internal_static_com_example_wewrite_Events_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.wewrite.ProtocalBuffer.Events.class, com.example.wewrite.ProtocalBuffer.Events.Builder.class);
      }

      // Construct using com.example.wewrite.ProtocalBuffer.Events.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        globalStart_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        removeLength_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        insertLength_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        insertCharacters_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        removeCharacters_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        username_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        afterGlobalOrderId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.wewrite.ProtocalBuffer.internal_static_com_example_wewrite_Events_descriptor;
      }

      public com.example.wewrite.ProtocalBuffer.Events getDefaultInstanceForType() {
        return com.example.wewrite.ProtocalBuffer.Events.getDefaultInstance();
      }

      public com.example.wewrite.ProtocalBuffer.Events build() {
        com.example.wewrite.ProtocalBuffer.Events result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.example.wewrite.ProtocalBuffer.Events buildPartial() {
        com.example.wewrite.ProtocalBuffer.Events result = new com.example.wewrite.ProtocalBuffer.Events(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.globalStart_ = globalStart_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.removeLength_ = removeLength_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.insertLength_ = insertLength_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.insertCharacters_ = insertCharacters_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.removeCharacters_ = removeCharacters_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.username_ = username_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.afterGlobalOrderId_ = afterGlobalOrderId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.example.wewrite.ProtocalBuffer.Events) {
          return mergeFrom((com.example.wewrite.ProtocalBuffer.Events)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.wewrite.ProtocalBuffer.Events other) {
        if (other == com.example.wewrite.ProtocalBuffer.Events.getDefaultInstance()) return this;
        if (other.hasGlobalStart()) {
          setGlobalStart(other.getGlobalStart());
        }
        if (other.hasRemoveLength()) {
          setRemoveLength(other.getRemoveLength());
        }
        if (other.hasInsertLength()) {
          setInsertLength(other.getInsertLength());
        }
        if (other.hasInsertCharacters()) {
          bitField0_ |= 0x00000008;
          insertCharacters_ = other.insertCharacters_;
          onChanged();
        }
        if (other.hasRemoveCharacters()) {
          bitField0_ |= 0x00000010;
          removeCharacters_ = other.removeCharacters_;
          onChanged();
        }
        if (other.hasUsername()) {
          bitField0_ |= 0x00000020;
          username_ = other.username_;
          onChanged();
        }
        if (other.hasAfterGlobalOrderId()) {
          setAfterGlobalOrderId(other.getAfterGlobalOrderId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGlobalStart()) {
          
          return false;
        }
        if (!hasRemoveLength()) {
          
          return false;
        }
        if (!hasInsertLength()) {
          
          return false;
        }
        if (!hasInsertCharacters()) {
          
          return false;
        }
        if (!hasRemoveCharacters()) {
          
          return false;
        }
        if (!hasUsername()) {
          
          return false;
        }
        if (!hasAfterGlobalOrderId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.example.wewrite.ProtocalBuffer.Events parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.wewrite.ProtocalBuffer.Events) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 globalStart = 1;
      private int globalStart_ ;
      /**
       * <code>required int32 globalStart = 1;</code>
       */
      public boolean hasGlobalStart() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 globalStart = 1;</code>
       */
      public int getGlobalStart() {
        return globalStart_;
      }
      /**
       * <code>required int32 globalStart = 1;</code>
       */
      public Builder setGlobalStart(int value) {
        bitField0_ |= 0x00000001;
        globalStart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 globalStart = 1;</code>
       */
      public Builder clearGlobalStart() {
        bitField0_ = (bitField0_ & ~0x00000001);
        globalStart_ = 0;
        onChanged();
        return this;
      }

      // required int32 removeLength = 2;
      private int removeLength_ ;
      /**
       * <code>required int32 removeLength = 2;</code>
       */
      public boolean hasRemoveLength() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 removeLength = 2;</code>
       */
      public int getRemoveLength() {
        return removeLength_;
      }
      /**
       * <code>required int32 removeLength = 2;</code>
       */
      public Builder setRemoveLength(int value) {
        bitField0_ |= 0x00000002;
        removeLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 removeLength = 2;</code>
       */
      public Builder clearRemoveLength() {
        bitField0_ = (bitField0_ & ~0x00000002);
        removeLength_ = 0;
        onChanged();
        return this;
      }

      // required int32 insertLength = 3;
      private int insertLength_ ;
      /**
       * <code>required int32 insertLength = 3;</code>
       */
      public boolean hasInsertLength() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 insertLength = 3;</code>
       */
      public int getInsertLength() {
        return insertLength_;
      }
      /**
       * <code>required int32 insertLength = 3;</code>
       */
      public Builder setInsertLength(int value) {
        bitField0_ |= 0x00000004;
        insertLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 insertLength = 3;</code>
       */
      public Builder clearInsertLength() {
        bitField0_ = (bitField0_ & ~0x00000004);
        insertLength_ = 0;
        onChanged();
        return this;
      }

      // required string insertCharacters = 4;
      private java.lang.Object insertCharacters_ = "";
      /**
       * <code>required string insertCharacters = 4;</code>
       */
      public boolean hasInsertCharacters() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string insertCharacters = 4;</code>
       */
      public java.lang.String getInsertCharacters() {
        java.lang.Object ref = insertCharacters_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          insertCharacters_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string insertCharacters = 4;</code>
       */
      public com.google.protobuf.ByteString
          getInsertCharactersBytes() {
        java.lang.Object ref = insertCharacters_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          insertCharacters_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string insertCharacters = 4;</code>
       */
      public Builder setInsertCharacters(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        insertCharacters_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string insertCharacters = 4;</code>
       */
      public Builder clearInsertCharacters() {
        bitField0_ = (bitField0_ & ~0x00000008);
        insertCharacters_ = getDefaultInstance().getInsertCharacters();
        onChanged();
        return this;
      }
      /**
       * <code>required string insertCharacters = 4;</code>
       */
      public Builder setInsertCharactersBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        insertCharacters_ = value;
        onChanged();
        return this;
      }

      // required string removeCharacters = 5;
      private java.lang.Object removeCharacters_ = "";
      /**
       * <code>required string removeCharacters = 5;</code>
       */
      public boolean hasRemoveCharacters() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required string removeCharacters = 5;</code>
       */
      public java.lang.String getRemoveCharacters() {
        java.lang.Object ref = removeCharacters_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          removeCharacters_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string removeCharacters = 5;</code>
       */
      public com.google.protobuf.ByteString
          getRemoveCharactersBytes() {
        java.lang.Object ref = removeCharacters_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          removeCharacters_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string removeCharacters = 5;</code>
       */
      public Builder setRemoveCharacters(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        removeCharacters_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string removeCharacters = 5;</code>
       */
      public Builder clearRemoveCharacters() {
        bitField0_ = (bitField0_ & ~0x00000010);
        removeCharacters_ = getDefaultInstance().getRemoveCharacters();
        onChanged();
        return this;
      }
      /**
       * <code>required string removeCharacters = 5;</code>
       */
      public Builder setRemoveCharactersBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        removeCharacters_ = value;
        onChanged();
        return this;
      }

      // required string username = 6;
      private java.lang.Object username_ = "";
      /**
       * <code>required string username = 6;</code>
       */
      public boolean hasUsername() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required string username = 6;</code>
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string username = 6;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string username = 6;</code>
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string username = 6;</code>
       */
      public Builder clearUsername() {
        bitField0_ = (bitField0_ & ~0x00000020);
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>required string username = 6;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        username_ = value;
        onChanged();
        return this;
      }

      // required sint32 afterGlobalOrderId = 7;
      private int afterGlobalOrderId_ ;
      /**
       * <code>required sint32 afterGlobalOrderId = 7;</code>
       */
      public boolean hasAfterGlobalOrderId() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required sint32 afterGlobalOrderId = 7;</code>
       */
      public int getAfterGlobalOrderId() {
        return afterGlobalOrderId_;
      }
      /**
       * <code>required sint32 afterGlobalOrderId = 7;</code>
       */
      public Builder setAfterGlobalOrderId(int value) {
        bitField0_ |= 0x00000040;
        afterGlobalOrderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required sint32 afterGlobalOrderId = 7;</code>
       */
      public Builder clearAfterGlobalOrderId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        afterGlobalOrderId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.example.wewrite.Events)
    }

    static {
      defaultInstance = new Events(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.example.wewrite.Events)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_wewrite_Events_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_example_wewrite_Events_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rWeWrite.proto\022\023com.example.wewrite\"\253\001\n" +
      "\006Events\022\023\n\013globalStart\030\001 \002(\005\022\024\n\014removeLe" +
      "ngth\030\002 \002(\005\022\024\n\014insertLength\030\003 \002(\005\022\030\n\020inse" +
      "rtCharacters\030\004 \002(\t\022\030\n\020removeCharacters\030\005" +
      " \002(\t\022\020\n\010username\030\006 \002(\t\022\032\n\022afterGlobalOrd" +
      "erId\030\007 \002(\021B\020B\016ProtocalBuffer"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_example_wewrite_Events_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_example_wewrite_Events_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_example_wewrite_Events_descriptor,
              new java.lang.String[] { "GlobalStart", "RemoveLength", "InsertLength", "InsertCharacters", "RemoveCharacters", "Username", "AfterGlobalOrderId", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
