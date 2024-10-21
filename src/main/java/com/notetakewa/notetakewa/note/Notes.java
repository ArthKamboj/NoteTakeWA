package com.notetakewa.notetakewa.note;


import jakarta.persistence.*;

@Entity
@Table
public class Notes {

        @Id
        @SequenceGenerator(name = "seq", sequenceName = "seq", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
        private int id;
        private String title;
        private String content;

        public Notes() {}

        public Notes(String title, String content) {

            this.title = title;
            this.content = content;
        }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

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

        @Override
        public String toString() {
            return "Notes{" +
                    "title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    '}';
        }
}
