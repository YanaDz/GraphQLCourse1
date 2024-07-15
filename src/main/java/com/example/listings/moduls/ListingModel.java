package com.example.listings.moduls;

import com.example.listings.generated.types.Listing;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListingModel extends Listing {
    // custom logic will live here
}