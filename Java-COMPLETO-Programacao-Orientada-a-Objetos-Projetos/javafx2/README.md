# ComboBox

Checklist: 

- Propriedade Prompt Text 

- Usar tipo genérico, por exemplo: ComboBox<Person> 

- ObservableList<Person>, ObservableSet<Person>, ObservableMap<Person> 
  - Para criar um ObservableList: FXCollections.observableList(list) 
- ComboBox.setItems(observableList)
- Nota: o combo box, por padrão, mostra o toString do objeto 
- Para obter o elemento selecionado: comboBox.getSelectionModel().getSelectedItem() 
- Para acessar a coleção: comboBox.getItems() 
- Para definir o que mostrar na comboBox:

