// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: report.proto

package sep3.project.protobuf;

/**
 * Protobuf type {@code ResponseGetReports}
 */
public final class ResponseGetReports extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ResponseGetReports)
    ResponseGetReportsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseGetReports.newBuilder() to construct.
  private ResponseGetReports(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseGetReports() {
    reports_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResponseGetReports();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseGetReports(
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
              reports_ = new java.util.ArrayList<sep3.project.protobuf.ReportData>();
              mutable_bitField0_ |= 0x00000001;
            }
            reports_.add(
                input.readMessage(sep3.project.protobuf.ReportData.parser(), extensionRegistry));
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
        reports_ = java.util.Collections.unmodifiableList(reports_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sep3.project.protobuf.Report.internal_static_ResponseGetReports_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sep3.project.protobuf.Report.internal_static_ResponseGetReports_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sep3.project.protobuf.ResponseGetReports.class, sep3.project.protobuf.ResponseGetReports.Builder.class);
  }

  public static final int REPORTS_FIELD_NUMBER = 1;
  private java.util.List<sep3.project.protobuf.ReportData> reports_;
  /**
   * <code>repeated .ReportData reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<sep3.project.protobuf.ReportData> getReportsList() {
    return reports_;
  }
  /**
   * <code>repeated .ReportData reports = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends sep3.project.protobuf.ReportDataOrBuilder> 
      getReportsOrBuilderList() {
    return reports_;
  }
  /**
   * <code>repeated .ReportData reports = 1;</code>
   */
  @java.lang.Override
  public int getReportsCount() {
    return reports_.size();
  }
  /**
   * <code>repeated .ReportData reports = 1;</code>
   */
  @java.lang.Override
  public sep3.project.protobuf.ReportData getReports(int index) {
    return reports_.get(index);
  }
  /**
   * <code>repeated .ReportData reports = 1;</code>
   */
  @java.lang.Override
  public sep3.project.protobuf.ReportDataOrBuilder getReportsOrBuilder(
      int index) {
    return reports_.get(index);
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
    for (int i = 0; i < reports_.size(); i++) {
      output.writeMessage(1, reports_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < reports_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, reports_.get(i));
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
    if (!(obj instanceof sep3.project.protobuf.ResponseGetReports)) {
      return super.equals(obj);
    }
    sep3.project.protobuf.ResponseGetReports other = (sep3.project.protobuf.ResponseGetReports) obj;

    if (!getReportsList()
        .equals(other.getReportsList())) return false;
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
    if (getReportsCount() > 0) {
      hash = (37 * hash) + REPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getReportsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sep3.project.protobuf.ResponseGetReports parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.project.protobuf.ResponseGetReports parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetReports parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.project.protobuf.ResponseGetReports parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetReports parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.project.protobuf.ResponseGetReports parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetReports parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.project.protobuf.ResponseGetReports parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetReports parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sep3.project.protobuf.ResponseGetReports parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.project.protobuf.ResponseGetReports parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.project.protobuf.ResponseGetReports parseFrom(
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
  public static Builder newBuilder(sep3.project.protobuf.ResponseGetReports prototype) {
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
   * Protobuf type {@code ResponseGetReports}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ResponseGetReports)
      sep3.project.protobuf.ResponseGetReportsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sep3.project.protobuf.Report.internal_static_ResponseGetReports_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sep3.project.protobuf.Report.internal_static_ResponseGetReports_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sep3.project.protobuf.ResponseGetReports.class, sep3.project.protobuf.ResponseGetReports.Builder.class);
    }

    // Construct using sep3.project.protobuf.ResponseGetReports.newBuilder()
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
        getReportsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (reportsBuilder_ == null) {
        reports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        reportsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sep3.project.protobuf.Report.internal_static_ResponseGetReports_descriptor;
    }

    @java.lang.Override
    public sep3.project.protobuf.ResponseGetReports getDefaultInstanceForType() {
      return sep3.project.protobuf.ResponseGetReports.getDefaultInstance();
    }

    @java.lang.Override
    public sep3.project.protobuf.ResponseGetReports build() {
      sep3.project.protobuf.ResponseGetReports result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sep3.project.protobuf.ResponseGetReports buildPartial() {
      sep3.project.protobuf.ResponseGetReports result = new sep3.project.protobuf.ResponseGetReports(this);
      int from_bitField0_ = bitField0_;
      if (reportsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          reports_ = java.util.Collections.unmodifiableList(reports_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reports_ = reports_;
      } else {
        result.reports_ = reportsBuilder_.build();
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
      if (other instanceof sep3.project.protobuf.ResponseGetReports) {
        return mergeFrom((sep3.project.protobuf.ResponseGetReports)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sep3.project.protobuf.ResponseGetReports other) {
      if (other == sep3.project.protobuf.ResponseGetReports.getDefaultInstance()) return this;
      if (reportsBuilder_ == null) {
        if (!other.reports_.isEmpty()) {
          if (reports_.isEmpty()) {
            reports_ = other.reports_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReportsIsMutable();
            reports_.addAll(other.reports_);
          }
          onChanged();
        }
      } else {
        if (!other.reports_.isEmpty()) {
          if (reportsBuilder_.isEmpty()) {
            reportsBuilder_.dispose();
            reportsBuilder_ = null;
            reports_ = other.reports_;
            bitField0_ = (bitField0_ & ~0x00000001);
            reportsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReportsFieldBuilder() : null;
          } else {
            reportsBuilder_.addAllMessages(other.reports_);
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
      sep3.project.protobuf.ResponseGetReports parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sep3.project.protobuf.ResponseGetReports) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<sep3.project.protobuf.ReportData> reports_ =
      java.util.Collections.emptyList();
    private void ensureReportsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reports_ = new java.util.ArrayList<sep3.project.protobuf.ReportData>(reports_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        sep3.project.protobuf.ReportData, sep3.project.protobuf.ReportData.Builder, sep3.project.protobuf.ReportDataOrBuilder> reportsBuilder_;

    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public java.util.List<sep3.project.protobuf.ReportData> getReportsList() {
      if (reportsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reports_);
      } else {
        return reportsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public int getReportsCount() {
      if (reportsBuilder_ == null) {
        return reports_.size();
      } else {
        return reportsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public sep3.project.protobuf.ReportData getReports(int index) {
      if (reportsBuilder_ == null) {
        return reports_.get(index);
      } else {
        return reportsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public Builder setReports(
        int index, sep3.project.protobuf.ReportData value) {
      if (reportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportsIsMutable();
        reports_.set(index, value);
        onChanged();
      } else {
        reportsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public Builder setReports(
        int index, sep3.project.protobuf.ReportData.Builder builderForValue) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.set(index, builderForValue.build());
        onChanged();
      } else {
        reportsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public Builder addReports(sep3.project.protobuf.ReportData value) {
      if (reportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportsIsMutable();
        reports_.add(value);
        onChanged();
      } else {
        reportsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public Builder addReports(
        int index, sep3.project.protobuf.ReportData value) {
      if (reportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReportsIsMutable();
        reports_.add(index, value);
        onChanged();
      } else {
        reportsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public Builder addReports(
        sep3.project.protobuf.ReportData.Builder builderForValue) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.add(builderForValue.build());
        onChanged();
      } else {
        reportsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public Builder addReports(
        int index, sep3.project.protobuf.ReportData.Builder builderForValue) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.add(index, builderForValue.build());
        onChanged();
      } else {
        reportsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public Builder addAllReports(
        java.lang.Iterable<? extends sep3.project.protobuf.ReportData> values) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reports_);
        onChanged();
      } else {
        reportsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public Builder clearReports() {
      if (reportsBuilder_ == null) {
        reports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        reportsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public Builder removeReports(int index) {
      if (reportsBuilder_ == null) {
        ensureReportsIsMutable();
        reports_.remove(index);
        onChanged();
      } else {
        reportsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public sep3.project.protobuf.ReportData.Builder getReportsBuilder(
        int index) {
      return getReportsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public sep3.project.protobuf.ReportDataOrBuilder getReportsOrBuilder(
        int index) {
      if (reportsBuilder_ == null) {
        return reports_.get(index);  } else {
        return reportsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public java.util.List<? extends sep3.project.protobuf.ReportDataOrBuilder> 
         getReportsOrBuilderList() {
      if (reportsBuilder_ != null) {
        return reportsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reports_);
      }
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public sep3.project.protobuf.ReportData.Builder addReportsBuilder() {
      return getReportsFieldBuilder().addBuilder(
          sep3.project.protobuf.ReportData.getDefaultInstance());
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public sep3.project.protobuf.ReportData.Builder addReportsBuilder(
        int index) {
      return getReportsFieldBuilder().addBuilder(
          index, sep3.project.protobuf.ReportData.getDefaultInstance());
    }
    /**
     * <code>repeated .ReportData reports = 1;</code>
     */
    public java.util.List<sep3.project.protobuf.ReportData.Builder> 
         getReportsBuilderList() {
      return getReportsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        sep3.project.protobuf.ReportData, sep3.project.protobuf.ReportData.Builder, sep3.project.protobuf.ReportDataOrBuilder> 
        getReportsFieldBuilder() {
      if (reportsBuilder_ == null) {
        reportsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            sep3.project.protobuf.ReportData, sep3.project.protobuf.ReportData.Builder, sep3.project.protobuf.ReportDataOrBuilder>(
                reports_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        reports_ = null;
      }
      return reportsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ResponseGetReports)
  }

  // @@protoc_insertion_point(class_scope:ResponseGetReports)
  private static final sep3.project.protobuf.ResponseGetReports DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sep3.project.protobuf.ResponseGetReports();
  }

  public static sep3.project.protobuf.ResponseGetReports getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseGetReports>
      PARSER = new com.google.protobuf.AbstractParser<ResponseGetReports>() {
    @java.lang.Override
    public ResponseGetReports parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseGetReports(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseGetReports> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseGetReports> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sep3.project.protobuf.ResponseGetReports getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

