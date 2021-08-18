# Recuperar dados

**API:** 

- Statement 

- ResultSet 
  - first() [move para posição 1, se houver] 
  - beforeFirst() [move para posição 0] 
  - next() [move para o próximo, retorna false se já estiver no último] 
  - absolute(int) [move para a posição dada, lembrando que dados reais começam em 1] 

**Checklist:** 

- Usar o script SQL para criar a base de dados "coursejdbc" 
- Fazer um pequeno programa para recuperar os departamentos 
- Na classe DB, criar métodos auxiliares estáticos para fechar ResultSet e Statement 