package com.example.mychatapplication.model;

import com.google.firebase.Timestamp;
;

    public class UserModel {
        private String phone;
        private String username;

        private String userID;

        public UserModel() {
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Timestamp getCreatedTimestamp() {
            return createdTimestamp;
        }

        public void setCreatedTimestamp(Timestamp createdTimestamp) {
            this.createdTimestamp = createdTimestamp;
        }

        public String getUserID() {
            return userID;
        }

        public void setUserID(String userID) {
            this.userID = userID;
        }

        public UserModel(String phone, String username, Timestamp createdTimestamp, String userID) {
            this.phone = phone;
            this.username = username;
            this.createdTimestamp = createdTimestamp;
            this.userID = userID;
        }

        private Timestamp createdTimestamp;

    }
