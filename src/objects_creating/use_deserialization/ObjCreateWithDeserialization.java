package objects_creating.use_deserialization;

import java.io.Serializable;

/**
 * ObjCreateWithDeserialization
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 07.06.2023.
 */
public class ObjCreateWithDeserialization implements Serializable {
    public int emp_id;
    public String emp_name;

    public ObjCreateWithDeserialization(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
}
