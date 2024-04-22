package co.com.flypass.constants;

public class Constants {

    private Constants() {
        throw new IllegalStateException("Utility class");
    }
    public static final String FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    public static final String RESPONSE_MESSAGE_KEY = "message";
    public static final String CLIENT_CREATED_MESSAGE = "User created successfully";
    public static final String CLIENT_UPDATED_MESSAGE = "User updated successfully";
    public static final String CLIENT_DELETED_MESSAGE = "User deleted successfully";


    public static final String TASK_CREATED_MESSAGE = "Task created successfully";
    public static final String TASK_UPDATED_MESSAGE = "Task updated successfully";
    public static final String TASK_DELETED_MESSAGE = "Task deleted successfully";

    public static final String DEFAULT_MESSAGE_ERROR = "Ocurrió un error procesando la solicitud, por favor contacta al administrador del sistema";
    public static final String SUCCESSFUL_REQUEST = "La solicitud fué exitosa";

}
