package com.example.moviesuggestionbackend.Entity.JsonEntity;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class JsonPremises {
    private String origin;
    private String genre;
    private String duration;
    private String actor;

    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof JsonPremises)) return false;
        JsonPremises js = (JsonPremises) o ;
        return this.origin.equals(js.getOrigin())&&
                this.genre.equals(js.getGenre())&&
                this.duration.equals(js.getDuration())&&
                this.actor.equals(js.getActor());
    }
    public int hashCode(){
        return Objects.hash(origin,genre,duration,actor);
    }

}
