public enum ErrorCode {
NOT_FOUND(404,"khong tim thay"),UNAUTHORIZED(401,"khong duoc cap quyen"),INVALIS_INPUT_PARAMS(400,"thieu du lieu du vao");
int code;
String message;
//code, message
    private ErrorCode(int code, String message){
        this.code=code;
        this.message=message;
    }
}
