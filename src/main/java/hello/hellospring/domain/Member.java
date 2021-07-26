package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    private String Content;

    public String getContent() {
        return Content;
    }

    public  void setContent(String content) {
        this.Content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
