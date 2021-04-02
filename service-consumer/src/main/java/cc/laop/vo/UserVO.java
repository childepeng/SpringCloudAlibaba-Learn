package cc.laop.vo;

/**
 * @Auther: Administrator
 * @Date: create in 2021/4/1 17:10
 * @Description:
 */
public class UserVO {

    private int id;
    private String username;

    public UserVO(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public UserVO setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserVO setUsername(String username) {
        this.username = username;
        return this;
    }
}
