package com.example.NEETCODE;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
        private int id;
        private String name;


        @Override
        public  boolean equals(Object O){
            if(this == O)
                return true;

            if(O== null || getClass() != O.getClass())
                return false;

            User user = (User) O;
//            this is actually type casting

            return id == user.id && Objects.equals(name , user.name);

        }

        @Override
    public int hashCode(){
            return Objects.hash(id , name);
        }



}
