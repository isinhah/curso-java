package src.enums_composicao.exercicio_3.entities;

import src.enums_composicao.exercicio_2.entities.HourContract;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    //Constante para toda aplicação
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>(); //composição de objetos

    public Post() {}

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    // Adicionar comentário na lista
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    // Remover comentário da lista
    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // Classe String Builder - Usar quando se monta uma string enorme a partir de várias string pequenas
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");

        //Date format
        sb.append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:\n");

        //Adicionando comentários no String BUild
        for (Comment c : comments) {
            sb.append(c.getText()).append("\n");
        }

        return sb.toString();
    }
}
