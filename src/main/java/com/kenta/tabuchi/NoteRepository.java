/**
 * 
 */
package com.kenta.tabuchi;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tabuchikenta
 * -----------------------------------------------------------------
 * |This is a DAO interface.
 * |JpaRepository< Table's model class , Key of Model >
 * -----------------------------------------------------------------
 */
public interface NoteRepository extends JpaRepository<Note,Long> {
	
}
