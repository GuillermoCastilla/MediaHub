package com.media.service;

import Model.MediaContent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MediaService {
    /**
     * Atributos
     */
    private List<MediaContent> library = new ArrayList<>();

    /**
     * Constructores
     */
    public MediaService() {}

    /**
     * Filtros
     * @param title
     * @return
     */
    public List filterByTitle(String title){
        return library.stream()
                .filter(media -> media.getTittle().contains(title))
                .collect(Collectors.toList());
    }

    public List getTopContentByDuration(){
        return library.stream()
                .sorted(Comparator.comparing(MediaContent::getDuration).reversed())
                .limit(5)
                .toList();
    }
}
