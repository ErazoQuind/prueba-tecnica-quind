package co.com.flypass.constants;

public class Constants {

    private Constants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String RESPONSE_MESSAGE_KEY = "message";
    public static final String USER_CREATED_MESSAGE = "Usuario creado exitosamente";
    public static final String USER_UPDATED_MESSAGE = "Usuario actualizado exitosamente";
    public static final String USER_DELETED_MESSAGE = "Usuario eliminado exitosamente";

    public static final String TASK_CREATED_MESSAGE = "Tarea creada exitosamente";
    public static final String TASK_UPDATED_MESSAGE = "Tarea actualizada exitosamente";
    public static final String TASK_DELETED_MESSAGE = "Tarea eliminada exitosamente";

    public static final String TASK_EXIST_MESSAGE = "La tarea ya existe en el sistema";
    public static final String TASK_NOT_FOUND_MESSAGE = "La tarea no se encontro en el sistema";

    public static final String DEFAULT_MESSAGE_ERROR = "Ocurrió un error procesando la solicitud, por favor contacta al administrador del sistema";
    public static final String SUCCESSFUL_REQUEST = "La solicitud fué exitosa";

}
