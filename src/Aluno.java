class Aluno {
      private String curso;
      private String matricula;
      private String descricao;
      private int id;
      private String nome;
      private String email;
      private String senha;
      private String vinculo;
      private String telefone;
      private String projeto;

      public void setCurso(String curso){
            if(curso != null){
                this.curso = curso;
            }
        }
        
        public String getCurso(){
            return curso;
        }

        public void setMatricula(String matricula){
            if(matricula != null && matricula.length() > 6){
                this.matricula = matricula;
            }
        }
        
        public String getMatricula(){
            return matricula;
        }

        public void setDescricao(String descricao){
            if(descricao != null){
                this.descricao = descricao;
            }
        }
        
        public String getDescricao(){
            return this.descricao;
        }

        public void setId(int id){
            if(String.valueOf(id).length() == 6){
                this.id = id;
            }
        }
        
        public int getId(){
            return this.id;
        }

        public void setNome(String nome){
            if(nome != null){
                this.nome = nome;
            }
        }
        
        public String getNome(){
            return this.nome;
        }

        public void setEmail(String email){
            if(email != null){
                this.email = email;
            }
        }
        
        public String getEmail(){
            return this.email;
        }

        public void setSenha(String senha){
            if(senha != null && senha.length() > 8){
                this.senha = senha;
            }
        }
        
        public String getSenha(){
            return this.senha;
        }

        public void setVinculo(String vinculo){
            if(vinculo != null){
                this.vinculo = vinculo;
            }
        }
        
        public String getVinculo(){
            return this.vinculo;
        }

        public void setTelefone(String telefone){
            if(telefone != null){
                this.telefone = telefone;
            }
        }
        
        public String getTelefone(){
            return this.telefone;
        }

        public void setProjeto(String projeto){
            if(projeto != null){
                this.projeto = projeto;
            }
        }
        
        public String getProjeto(){
            return this.projeto;
        }

      public void excluirAluno(String curso, String matricula, String descricao, int id, String nome, String email, String senha, String vinculo, String telefone, String projeto){
            // Possibilita excluir aluno que não possuir mais vínculo com a instrituição do sistema.
      }

      public void editarAluno(String curso, String matricula, String descricao, int id, String nome, String email, String senha, String vinculo, String telefone, String projeto){
            // Possibilita editar informações erradas ou desatualizadas do cadastro do aluno.
      }

//      public Reserva realizarReserva (Equipamento equipamento){
//            // Possibilita ao aluno solicitar reservas de quipamentos.
//      }
//
//      public Reserva realizarReserva (Espaco espaco) {
//            // Possibilita ao aluno solicitar reservas de espaço.
//      }

}
