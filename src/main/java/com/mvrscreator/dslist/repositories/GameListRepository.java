package com.mvrscreator.dslist.repositories;

import com.mvrscreator.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
