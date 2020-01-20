package com.wynx.wynx.dao;

import com.wynx.wynx.ds.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongDao extends CrudRepository<Song, String> {
}
