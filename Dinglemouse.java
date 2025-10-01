import java.util.*;
public class Dinglemouse {
enum Mode {
UP,
DOWN
  }
/**
   * Simula el movimiento del elevador hasta llevar a todas las personas a su destino.
   *
   * @param queues matriz que representa las colas de espera en cada piso.
   *               Cada subarreglo contiene los pisos a los que quieren ir las personas de ese piso.
   * @param capacity número máximo de personas que caben en el elevador.
   * @return arreglo de enteros representando los pisos donde se detuvo el elevador, en orden.
   */
public static int[] theLift(final int[][] queues, final int capacity) {
int currentFloor = 0; // El piso actual donde se encuentra el elevador.
Mode mode = Mode.UP; // Dirección actual del elevador (subiendo por defecto).
List<Integer> lift = new ArrayList<>(); // Personas dentro del elevador (solo se guarda su destino).
List<Integer> stops = new ArrayList<>(); // Pisos donde el elevador se detiene.
// Convierte el arreglo de colas a una estructura más flexible (List<List<Integer>>)
List<List<Integer>> floorQueues = convertToQueueList(queues);
int nextFloor = 0; // Próximo piso a visitar
// Ciclo principal: se ejecuta mientras haya personas esperando o dentro del elevador
do {
// Actualiza la dirección del elevador según el próximo piso
if (nextFloor > currentFloor) {
mode = Mode.UP;
      } else if (nextFloor < currentFloor) {
mode = Mode.DOWN;
      }
currentFloor = nextFloor; // Mover el elevador al siguiente piso
// Procesar el piso actual: bajar, subir personas y registrar parada
processCurrentFloor(currentFloor, mode, lift, floorQueues, capacity, stops);
// Determina el siguiente piso que debe visitar
nextFloor = getNextStop(currentFloor, mode, lift, floorQueues);
    } while (nextFloor != -1); // Repite hasta que no haya nadie esperando ni dentro del elevador
// Si el elevador no terminó en planta baja, regresar a 0
if (currentFloor != 0) {
stops.add(0);
    }
// Convertir la lista de paradas a un arreglo de enteros
return stops.stream().mapToInt(i -> i).toArray();
  }
/**
   * Convierte el arreglo de colas de piso a una lista de listas para facilitar su manipulación.
   *
   * @param queues matriz original de colas por piso.
   * @return lista de listas de enteros representando las colas de cada piso.
   */
private static List<List<Integer>> convertToQueueList(int[][] queues) {
// Crear una lista de listas vacía
// Recorrer cada arreglo de personas por piso
// Convertir cada arreglo a una lista y agregarlo a la estructura final
return null; // Reemplazar con la estructura construida
  }
/**
   * Decide cuál es el siguiente piso que el elevador debe visitar.
   *
   * @param currentFloor piso actual.
   * @param mode dirección actual (subiendo o bajando).
   * @param lift personas dentro del elevador.
   * @param floorQueues personas esperando por piso.
   * @return número de piso a visitar o -1 si ya no hay nada por hacer.
   */
private static int getNextStop(
int currentFloor,
Mode mode,
List<Integer> lift,
List<List<Integer>> floorQueues) {
// Si el elevador está vacío:
//   - Buscar hacia arriba el piso más alto con alguien que quiera bajar (si va UP)
//   - Buscar hacia abajo el piso más bajo con alguien que quiera subir (si va DOWN)
//   - Si no hay personas en esa dirección, buscar cualquier piso con personas
//   - Retornar -1 si no hay nadie esperando
// Si el elevador no está vacío:
//   - Cambiar dirección si está en un extremo (piso 0 o máximo)
//   - Usar getNextUpStop o getNextDownStop para decidir a dónde ir
return -1; // Reemplazar con el siguiente piso
  }
/**
   * Determina el próximo piso al subir.
   *
   * @param currentFloor piso actual.
   * @param lift personas dentro del elevador.
   * @param floorQueues personas esperando en pisos.
   * @return el piso más cercano hacia arriba donde debe detenerse.
   */
private static int getNextUpStop(int currentFloor, List<Integer> lift, List<List<Integer>> floorQueues) {
// Buscar el próximo piso hacia arriba donde:
//   - Alguien dentro del elevador quiera bajarse
//   - Alguien esperando quiera subir (destino > piso)
return -1; // Reemplazar con el piso encontrado
  }
/**
   * Determina el próximo piso al bajar.
   *
   * @param currentFloor piso actual.
   * @param lift personas dentro del elevador.
   * @param floorQueues personas esperando en pisos.
   * @return el piso más cercano hacia abajo donde debe detenerse.
   */
private static int getNextDownStop(int currentFloor, List<Integer> lift, List<List<Integer>> floorQueues) {
// Buscar el próximo piso hacia abajo donde:
//   - Alguien dentro del elevador quiera bajarse
//   - Alguien esperando quiera bajar (destino < piso)
return -1; // Reemplazar con el piso encontrado
  }
/**
   * Procesa las acciones del elevador al llegar a un piso:
   * - Baja a las personas que llegaron a su destino.
   * - Sube a las personas que van en la dirección del elevador (o a cualquiera si está vacío).
   * - Registra el piso como parada.
   *
   * @param currentFloor piso actual.
   * @param mode dirección actual del elevador.
   * @param lift lista de destinos de personas dentro del elevador.
   * @param floorQueues lista de personas esperando en cada piso.
   * @param capacity capacidad máxima del elevador.
   * @param stops lista de pisos donde el elevador se ha detenido.
   */
private static void processCurrentFloor(
int currentFloor,
Mode mode,
List<Integer> lift,
List<List<Integer>> floorQueues,
int capacity,
List<Integer> stops
  ) {
// Agregar currentFloor a stops (registro de paradas)
// Quitar del elevador a todas las personas cuyo destino sea currentFloor
// Revisar la cola del piso actual y subir personas:
//   - Si el elevador está vacío, permitir que suba cualquiera
//   - Si no, permitir solo si van en la misma dirección
//   - Respetar el límite de capacidad
  }
}