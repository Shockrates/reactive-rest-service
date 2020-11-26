package com.example.reactiverestservice.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Photos {
    public int albumId;
    public int id;
    public String title;
    public String url;
    public String thumbnailUrl;
}
