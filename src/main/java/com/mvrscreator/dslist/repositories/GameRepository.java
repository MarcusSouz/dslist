package com.mvrscreator.dslist.repositories;

import com.mvrscreator.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
