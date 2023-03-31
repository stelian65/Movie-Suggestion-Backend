package com.example.moviesuggestionbackend.Entity.JsonEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonConclusionPremises {
    private JsonPremises premises;
    private JsonConclusion conclusion;
}
