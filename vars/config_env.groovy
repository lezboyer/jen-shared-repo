def call(Mab config = [:]) {
   sh "echo hello ${config.name}. Today is ${config.day}"
} 
