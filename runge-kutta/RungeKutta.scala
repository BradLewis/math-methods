object RungeKutta {
    def main(args: Array[String]) {
        
    }

    def rungeKutta(fy: (Double, Double) => Double, 
                    yn: Double, 
                    tn: Double,
                    stepsize: Double): Double {
        k1 = stepsize * fy(tn, yn)
    }
}