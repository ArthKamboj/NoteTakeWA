package com.notetakewa.notetakewa.note;

public class Notes {

        private String title;
        private String content;

        public Notes() {}

        public Notes(String title, String content) {
            this.title = title;
            this.content = content;
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

        @Override
        public String toString() {
            return "Notes{" +
                    "title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    '}';
        }
}
