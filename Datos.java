public class Datos {


        public static Datos instance = null;

        private Datos(int numeroAleatorio, int numero, int intentosMax, int aciertos, String alias, Datos record, int contadorIntentos, int rondasPartida, int rondaActual, int fallos) {
            this.numeroAleatorio = numeroAleatorio;
            Numero = numero;
            this.intentosMax = intentosMax;
            Aciertos = aciertos;
            this.alias = alias;
            this.contadorIntentos = contadorIntentos;
            this.rondasPartida = rondasPartida;
            this.rondaActual = rondaActual;
            this.fallos = fallos;
        }
        /**
         * Numero generado para adivinar
         */
        private int numeroAleatorio;

        /**
         * Numero introducido por el usuario
         */
        private int Numero;

        /**
         * Numero de intentos que tiene el usuario para acertar el dato
         */
        private int intentosMax;

        /**
         * Numero de aciertos en una partida
         */
        private int Aciertos;

        /**
         * Alias del jugador
         */
        private String alias;

        /**
         * Contador de intentos que el usuario lleva para adivinar el numero
         */
        private int contadorIntentos;

        /**
         * Rondas que tiene cada partida
         */
        private int rondasPartida;

        /**
         * Ronda en la que se encuentra el jugador
         */
        private int rondaActual;

        /**
         * Fallos del jugador en la partida
         */
        private int fallos;

        /**
         * Getter y setter de todos las variables ya propuestas
         * @return
         */
        public int getNumeroAleatorio() {
            return numeroAleatorio;
        }

        public void setNumeroAleatorio(int numeroAleatorio) {
            this.numeroAleatorio = numeroAleatorio;
        }

        public int getNumero() {
            return Numero;
        }

        public void setNumero(int numero) {
            Numero = numero;
        }

        public int getIntentosMax() {
            return intentosMax;
        }

        public void setIntentosMax(int intentosMax) {
            this.intentosMax = intentosMax;
        }

        public int getAciertos() {
            return Aciertos;
        }

        public void setAciertos(int aciertos) {
            Aciertos = aciertos;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }


        public int getContadorIntentos() {
            return contadorIntentos;
        }

        public void setContadorIntentos(int contadorIntentos) {
            this.contadorIntentos = contadorIntentos;
        }

        public int getRondasPartida() {
            return rondasPartida;
        }

        public void setRondasPartida(int rondasPartida) {
            this.rondasPartida = rondasPartida;
        }

        public int getRondaActual() {
            return rondaActual;
        }

        public void setRondaActual(int rondaActual) {
            this.rondaActual = rondaActual;
        }

        public int getFallos() {
            return fallos;
        }

        public void setFallos(int fallos) {
            this.fallos = fallos;
        }



        public static getInstance(Datos instance){
            if (instance==null){
                instance=new Datos(instance.numeroAleatorio, instance.Numero, instance.intentosMax, instance.Aciertos, instance.alias,instance.contadorIntentos,instance.rondasPartida,instance.rondaActual,instance.fallos);
            }
            return instance;
        }

    }

}
