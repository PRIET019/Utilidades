package es.fpsumma.dam2.utilidades.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import es.fpsumma.dam2.utilidades.model.Clase
import kotlinx.coroutines.flow.Flow

@Dao
interface ClaseDao {

    @Insert(onConflict = onConFlictStrategy.IGNORE)
    suspend fun insert(clase : Clase)

    @Delete
    suspend fun update(clase: Clase)

    @Query("Select * From clase WHERE asignatura = :asignatura ")
    fun  getClase(asignatura: String): Flow<Clase>


}