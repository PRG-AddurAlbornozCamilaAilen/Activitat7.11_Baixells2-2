package actividadbarcos2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Data {
	
	private int dia;
	
	private int mes;
	
	private int any;

	private static final String[] DIES_TEXT = new String[] { "domingo", "lunes", "martes", "miercoles", "jueves", "viernes",
			"sabado"};

	private static final String[] MESOS_TEXT = new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio",
			"julio", "agosto", "septiembre", "octubre", "noviembre", "dismbre" };
        

	/**
	 *  Constructor por defecto
	 *  Inicializa una fecha a dia 1-1-1970
	 */
	public Data() {
                 this.dia=01;
                this.mes=01;
		this.any=1970;
	}

	/**
	 *  Inicializa la fecha
	 *  @param dia de la semana
	 *  @param mes del año
	 *  @param anyo
	 */
	public Data(int dia, int mes, int any) {
		this.dia=dia;
                this.mes=mes;
                this.any=any;
	}

	/**
	 * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
	 *
	 * Deberemos trocearlas de forma que asignemos el día més y año a cada uno de los atributoe
	 * @param fecha
	 */
	public Data(String data) {
            
                
		StringTokenizer dataSeparada = new StringTokenizer(data, "/");
                this.dia=Integer.parseInt(dataSeparada.nextToken());
                this.mes=Integer.parseInt(dataSeparada.nextToken());
                this.any=Integer.parseInt(dataSeparada.nextToken());        

	}

	/**
	 * Modifica la fecha actual a partir de los datos pasados como argumento
	 */
	public void set(int dia, int mes, int anyo) {
		this.any=anyo;
                this.dia=dia;
                this.mes=mes;
	}

	/**
	 * Obtiene una fecha con los mismos atributos que la fecha actual
	 * @return
	 */
	public Data clone() {
		return null;
	}

	/**
	 * Devuelve el día de la semana que representa por la Fecha actual
	 * @return @dia
	 */
	public int getDia() {
		return this.dia;
	}

	/**
	 * Devuelve el mes que representa la Fecha actual
	 * @return @mes
	 */
	public int getMes(){
		return this.mes;
	}

	/**
	 * Devuelve el año que representa la Fecha actual
	 * @return @mes
	 */
	public int getAny(){
		return this.any;
	}

	/**
	 * Muestra por pantalla la fecha en formato español dd-mm-yyyy
	 */
	public void mostrarEnFormatES()  {
		Date fecha = new Date(this.any - 1900, this.mes - 1, this.dia); // Se resta 1900 al año y 1 al mes
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                String fechaFormateada = formato.format(fecha);
                System.out.println(fechaFormateada);
	}

	/**
	 * Muestra por pantalla la fecha en formato inglés yyyy-mm-dd
	 */
	public void mostrarEnFormatGB() {
	Date fecha = new Date(this.any - 1900, this.mes - 1, this.dia); // Se resta 1900 al año y 1 al mes
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada = formato.format(fecha);
        System.out.println(fechaFormateada);
	}

	/**
	 * Muestra por pantalla la fecha en formato texto dd-mmmm-yyyy
	 * Ej. 1 enero de 1970
	 */
	public void mostrarEnFormatText() {
             System.out.printf("%02d-%s-%04d%n", this.dia, MESOS_TEXT[this.mes - 1], this.any);

	}

	/**
	 * Retorna un booleano indicando si la fecha del objeto es igual a la fecha pasada como
	 * argumento
	 *
	 * @return boolean
	 */
	public boolean isIgual(Data otraFecha) {
		return this.dia == otraFecha.getDia() && this.mes == otraFecha.getMes() && this.any == otraFecha.getAny();
	}

	/**
	 * Retorna el dia correspondiente de la semana en formato String
	 * @return String
	 */
	public String getDiaSetmana() {
		return null;
	}

	/**
	 * Solo Festivo sábado o domingo
	 * @return boolean
	 */
	public boolean isFestiu() {
		return false;
	}

	/**
	 * Devuelve el número de la semana dentro del año actual.
	 *
	 * @return int dia semana
	 */
	public int getNumeroSetmana() {
		return 0;
	}

	/**
	 * Devuelve un objeto de tipo fecha que representa una fecha añadiendo @numDias
	 * A la fecha Actual. El número máximo de dias a restar es 30
	 *
	 * @return boolean
	 */
	public Data afegir(int numDias){
		return null;
	}

	/**
	 * Devuelve un objeto de tipo fecha que representa una fecha restando @numDias
	 * A la fecha Actual. El número máximo de dias a restar es 30
	 *
	 * @return boolean
	 */
	public Data restar(int numDias){
		return null;
	}

	public boolean isCorrecta(){
		return false;
	}

	/**
	 * Retorna el mes del año en formato text (enero, febrero, marzo,...)
	 * @return char
	 */
	private String getMesEnFormatText() {
		return null;
	}

	/**
	 * Devuelve el número de dias transcurridos desde el 1-1-1
	 *
	 * @return int
	 */
	private int getDiesTranscorregutsOrigen() {
		return 0;
	}

	/**
	 * Devuelve el número de dias transcurridos en el anyo que representa el objeto
	 *
	 * @return int
	 */
	private int getDiesTranscorregutsEnAny() {
		return 0;
	}

	/**
	 * Indica si el año pasado como argumento es bisiesto. Un año es bisiesto si es divisible por 4
	 * pero no es divisible entre 100 o es divisible entre 4 entre 100 y entre 400
	 *
	 * @return boolean
	 */
	public static boolean isBisiesto(int anyo){
		return false;
	}

	/**
	 *  Calcula el número de días que tiene el @mes en el @año pasado como argumento
	 *  Deberás hacer uso del métodos isBisiesto
	 *
	 *  @return int total dias mes en curso
	 */
	public static int getDiesMes (int mes, int anyo) {
		return 0;
	}

	/**
	 * Calcula el número total de dias que tiene el año pasado como argumento
	 *
	 * @return int total dias anyo en curso
	 */
	public static int getDiesAny (int anyo){
		return 0;
	}
}
