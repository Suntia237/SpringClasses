package cn.edu.xync.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private int oid;
    private String content;
    private int total;
    private User user;

    public Order(String content, int total, User user) {
        this.content = content;
        this.total = total;
        this.user = user;
    }
}
