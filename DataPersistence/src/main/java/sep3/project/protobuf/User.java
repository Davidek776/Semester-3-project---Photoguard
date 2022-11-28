// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package sep3.project.protobuf;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestCreateUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestCreateUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestGetUsers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestGetUsers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseGetUsers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseGetUsers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestGerByIdUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestGerByIdUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\"\203\001\n\010UserData\022\n\n\002id\030\001 \001(\003\022\020\n" +
      "\010username\030\002 \001(\t\022\021\n\tfirstName\030\003 \001(\t\022\020\n\010la" +
      "stName\030\004 \001(\t\022\r\n\005email\030\005 \001(\t\022\020\n\010password\030" +
      "\006 \001(\t\022\023\n\013phoneNumber\030\007 \001(\t\"\200\001\n\021RequestCr" +
      "eateUser\022\020\n\010username\030\001 \001(\t\022\021\n\tfirstName\030" +
      "\002 \001(\t\022\020\n\010lastName\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\022\020" +
      "\n\010password\030\005 \001(\t\022\023\n\013phoneNumber\030\006 \001(\t\"5\n" +
      "\017RequestGetUsers\022\025\n\010username\030\001 \001(\tH\000\210\001\001B" +
      "\013\n\t_username\"/\n\020ResponseGetUsers\022\033\n\010user" +
      "Data\030\001 \003(\0132\t.UserData\" \n\022RequestGerByIdU" +
      "ser\022\n\n\002id\030\001 \001(\0032\232\001\n\013UserService\022+\n\nCreat" +
      "eUser\022\022.RequestCreateUser\032\t.UserData\022/\n\010" +
      "GetUsers\022\020.RequestGetUsers\032\021.ResponseGet" +
      "Users\022-\n\013GetByIdUser\022\023.RequestGerByIdUse" +
      "r\032\t.UserDataB\031\n\025sep3.project.protobufP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UserData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UserData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserData_descriptor,
        new java.lang.String[] { "Id", "Username", "FirstName", "LastName", "Email", "Password", "PhoneNumber", });
    internal_static_RequestCreateUser_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RequestCreateUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestCreateUser_descriptor,
        new java.lang.String[] { "Username", "FirstName", "LastName", "Email", "Password", "PhoneNumber", });
    internal_static_RequestGetUsers_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_RequestGetUsers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestGetUsers_descriptor,
        new java.lang.String[] { "Username", "Username", });
    internal_static_ResponseGetUsers_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ResponseGetUsers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseGetUsers_descriptor,
        new java.lang.String[] { "UserData", });
    internal_static_RequestGerByIdUser_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_RequestGerByIdUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestGerByIdUser_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
