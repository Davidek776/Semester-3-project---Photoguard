// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package sep3.project.protobuf;

/**
 * Protobuf type {@code ResponseGetUsers}
 */
public final class ResponseGetUsers extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ResponseGetUsers)
    ResponseGetUsersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseGetUsers.newBuilder() to construct.
  private ResponseGetUsers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseGetUsers() {
    userData_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResponseGetUsers();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseGetUsers(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              userData_ = new java.util.ArrayList<sep3.project.protobuf.UserData>();
              mutable_bitField0_ |= 0x00000001;
            }
            userData_.add(
                input.readMessage(sep3.project.protobuf.UserData.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        userData_ = java.util.Collections.unmodifiableList(userData_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sep3.project.protobuf.User.internal_static_ResponseGetUsers_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sep3.project.protobuf.User.internal_static_ResponseGetUsers_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sep3.project.protobuf.ResponseGetUsers.class, sep3.project.protobuf.ResponseGetUsers.Builder.class);
  }

  public static final int USERDATA_FIELD_NUMBER = 1;
  private java.util.List<sep3.project.protobuf.UserData> userData_;
  /**
   * <code>repeated .UserData userData = 1;</code>
   */
  @java.lang.Override
  public java.util.List<sep3.project.protobuf.UserData> getUserDataList() {
    return userData_;
  }
  /**
   * <code>repeated .UserData userData = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends sep3.project.protobuf.UserDataOrBuilder> 
      getUserDataOrBuilderList() {
    return userData_;
  }
  /**
   * <code>repeated .UserData userData = 1;</code>
   */
  @java.lang.Override
  public int getUserDataCount() {
    return userData_.size();
  }
  /**
   * <code>repeated .UserData userData = 1;</code>
   */
  @java.lang.Override
  public sep3.project.protobuf.UserData getUserData(int index) {
    return userData_.get(index);
  }
  /**
   * <code>repeated .UserData userData = 1;</code>
   */
  @java.lang.Override
  public sep3.project.protobuf.UserDataOrBuilder getUserDataOrBuilder(
      int index) {
    return userData_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < userData_.size(); i++) {
      output.writeMessage(1, userData_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userData_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userData_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sep3.project.protobuf.ResponseGetUsers)) {
      return super.equals(obj);
    }
    sep3.project.protobuf.ResponseGetUsers other = (sep3.project.protobuf.ResponseGetUsers) obj;

    if (!getUserDataList()
        .equals(other.getUserDataList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUserDataCount() > 0) {
      hash = (37 * hash) + USERDATA_FIELD_NUMBER;
      hash = (53 * hash) + getUserDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sep3.project.protobuf.ResponseGetUsers parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.project.protobuf.ResponseGetUsers parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sep3.project.protobuf.ResponseGetUsers prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code ResponseGetUsers}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ResponseGetUsers)
      sep3.project.protobuf.ResponseGetUsersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sep3.project.protobuf.User.internal_static_ResponseGetUsers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sep3.project.protobuf.User.internal_static_ResponseGetUsers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sep3.project.protobuf.ResponseGetUsers.class, sep3.project.protobuf.ResponseGetUsers.Builder.class);
    }

    // Construct using sep3.project.protobuf.ResponseGetUsers.newBuilder()
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
        getUserDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userDataBuilder_ == null) {
        userData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userDataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sep3.project.protobuf.User.internal_static_ResponseGetUsers_descriptor;
    }

    @java.lang.Override
    public sep3.project.protobuf.ResponseGetUsers getDefaultInstanceForType() {
      return sep3.project.protobuf.ResponseGetUsers.getDefaultInstance();
    }

    @java.lang.Override
    public sep3.project.protobuf.ResponseGetUsers build() {
      sep3.project.protobuf.ResponseGetUsers result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sep3.project.protobuf.ResponseGetUsers buildPartial() {
      sep3.project.protobuf.ResponseGetUsers result = new sep3.project.protobuf.ResponseGetUsers(this);
      int from_bitField0_ = bitField0_;
      if (userDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userData_ = java.util.Collections.unmodifiableList(userData_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userData_ = userData_;
      } else {
        result.userData_ = userDataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sep3.project.protobuf.ResponseGetUsers) {
        return mergeFrom((sep3.project.protobuf.ResponseGetUsers)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sep3.project.protobuf.ResponseGetUsers other) {
      if (other == sep3.project.protobuf.ResponseGetUsers.getDefaultInstance()) return this;
      if (userDataBuilder_ == null) {
        if (!other.userData_.isEmpty()) {
          if (userData_.isEmpty()) {
            userData_ = other.userData_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserDataIsMutable();
            userData_.addAll(other.userData_);
          }
          onChanged();
        }
      } else {
        if (!other.userData_.isEmpty()) {
          if (userDataBuilder_.isEmpty()) {
            userDataBuilder_.dispose();
            userDataBuilder_ = null;
            userData_ = other.userData_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userDataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserDataFieldBuilder() : null;
          } else {
            userDataBuilder_.addAllMessages(other.userData_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sep3.project.protobuf.ResponseGetUsers parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sep3.project.protobuf.ResponseGetUsers) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<sep3.project.protobuf.UserData> userData_ =
      java.util.Collections.emptyList();
    private void ensureUserDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userData_ = new java.util.ArrayList<sep3.project.protobuf.UserData>(userData_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        sep3.project.protobuf.UserData, sep3.project.protobuf.UserData.Builder, sep3.project.protobuf.UserDataOrBuilder> userDataBuilder_;

    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public java.util.List<sep3.project.protobuf.UserData> getUserDataList() {
      if (userDataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userData_);
      } else {
        return userDataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public int getUserDataCount() {
      if (userDataBuilder_ == null) {
        return userData_.size();
      } else {
        return userDataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public sep3.project.protobuf.UserData getUserData(int index) {
      if (userDataBuilder_ == null) {
        return userData_.get(index);
      } else {
        return userDataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public Builder setUserData(
        int index, sep3.project.protobuf.UserData value) {
      if (userDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserDataIsMutable();
        userData_.set(index, value);
        onChanged();
      } else {
        userDataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public Builder setUserData(
        int index, sep3.project.protobuf.UserData.Builder builderForValue) {
      if (userDataBuilder_ == null) {
        ensureUserDataIsMutable();
        userData_.set(index, builderForValue.build());
        onChanged();
      } else {
        userDataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public Builder addUserData(sep3.project.protobuf.UserData value) {
      if (userDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserDataIsMutable();
        userData_.add(value);
        onChanged();
      } else {
        userDataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public Builder addUserData(
        int index, sep3.project.protobuf.UserData value) {
      if (userDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserDataIsMutable();
        userData_.add(index, value);
        onChanged();
      } else {
        userDataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public Builder addUserData(
        sep3.project.protobuf.UserData.Builder builderForValue) {
      if (userDataBuilder_ == null) {
        ensureUserDataIsMutable();
        userData_.add(builderForValue.build());
        onChanged();
      } else {
        userDataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public Builder addUserData(
        int index, sep3.project.protobuf.UserData.Builder builderForValue) {
      if (userDataBuilder_ == null) {
        ensureUserDataIsMutable();
        userData_.add(index, builderForValue.build());
        onChanged();
      } else {
        userDataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public Builder addAllUserData(
        java.lang.Iterable<? extends sep3.project.protobuf.UserData> values) {
      if (userDataBuilder_ == null) {
        ensureUserDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userData_);
        onChanged();
      } else {
        userDataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public Builder clearUserData() {
      if (userDataBuilder_ == null) {
        userData_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userDataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public Builder removeUserData(int index) {
      if (userDataBuilder_ == null) {
        ensureUserDataIsMutable();
        userData_.remove(index);
        onChanged();
      } else {
        userDataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public sep3.project.protobuf.UserData.Builder getUserDataBuilder(
        int index) {
      return getUserDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public sep3.project.protobuf.UserDataOrBuilder getUserDataOrBuilder(
        int index) {
      if (userDataBuilder_ == null) {
        return userData_.get(index);  } else {
        return userDataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public java.util.List<? extends sep3.project.protobuf.UserDataOrBuilder> 
         getUserDataOrBuilderList() {
      if (userDataBuilder_ != null) {
        return userDataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userData_);
      }
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public sep3.project.protobuf.UserData.Builder addUserDataBuilder() {
      return getUserDataFieldBuilder().addBuilder(
          sep3.project.protobuf.UserData.getDefaultInstance());
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public sep3.project.protobuf.UserData.Builder addUserDataBuilder(
        int index) {
      return getUserDataFieldBuilder().addBuilder(
          index, sep3.project.protobuf.UserData.getDefaultInstance());
    }
    /**
     * <code>repeated .UserData userData = 1;</code>
     */
    public java.util.List<sep3.project.protobuf.UserData.Builder> 
         getUserDataBuilderList() {
      return getUserDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        sep3.project.protobuf.UserData, sep3.project.protobuf.UserData.Builder, sep3.project.protobuf.UserDataOrBuilder> 
        getUserDataFieldBuilder() {
      if (userDataBuilder_ == null) {
        userDataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            sep3.project.protobuf.UserData, sep3.project.protobuf.UserData.Builder, sep3.project.protobuf.UserDataOrBuilder>(
                userData_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userData_ = null;
      }
      return userDataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ResponseGetUsers)
  }

  // @@protoc_insertion_point(class_scope:ResponseGetUsers)
  private static final sep3.project.protobuf.ResponseGetUsers DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sep3.project.protobuf.ResponseGetUsers();
  }

  public static sep3.project.protobuf.ResponseGetUsers getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseGetUsers>
      PARSER = new com.google.protobuf.AbstractParser<ResponseGetUsers>() {
    @java.lang.Override
    public ResponseGetUsers parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseGetUsers(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseGetUsers> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseGetUsers> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sep3.project.protobuf.ResponseGetUsers getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

