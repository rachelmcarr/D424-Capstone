package com.example.rareoddities.controllers;

import com.example.rareoddities.entities.Artist;
import com.example.rareoddities.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping
    public List<Artist> getAllArtists() {
        return artistService.getAll();
    }

    @PostMapping
    public Artist addArtist(@RequestBody Artist artist) {
        return artistService.save(artist);
    }
}
