package co.com.flypass.constants;

public class Constants {
    public static final String DEFAULT_MESSAGE_ERROR = "Ocurrió un error procesando la solicitud, por favor contacta al administrador del sistema";

    private Constants() {
        throw new IllegalStateException("Utility class");
    }
    public static final String FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String ACCOUNT_TRANSFER = "Transferencia entre cuentas";
    public static final String WITHDRAWAL = "Retiro";
    public static final String DEPOSIT = "Consignacion";
    public static final String ERROR_500="500";
    public static final String ERROR_UP_PRODUCT="Error actualizando el estado de la cuenta ";
    public static final String CLIENT_NOT_EXIST="El cliente no existe";
    public static final String CLIENT_NOT_SAVE="Error guardando el cliente";
    public static final String CLIENT_NOT_DELETED="Error eliminando el cliente";
    public static final String TR_NOT_CREATE="Error creando la transaccion";


    public static final String RESPONSE_MESSAGE_KEY = "message";
    public static final String CLIENT_CREATED_MESSAGE = "User created successfully";
    public static final String CLIENT_UPDATED_MESSAGE = "User updated successfully";
    public static final String CLIENT_DELETED_MESSAGE = "User deleted successfully";


    public static final String TASK_CREATED_MESSAGE = "Task created successfully";
    public static final String TASK_UPDATED_MESSAGE = "Task updated successfully";
    public static final String TASK_DELETED_MESSAGE = "Task deleted successfully";


    public static final String VALIDATION = "Error validando el atributo: ";
}
