<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">

    <div class="bpmnContainer">
      <div class="bpmn-canvas"></div>
    </div>

  </div>
</template>

<script>
import BpmnModeler from "bpmn-js/lib/Modeler";
import Objects from "langx-js/dist/Objects";

export default {
  name: 'App',
  data(){
    return {
      bpmnModeler: null,
      canvas: null,
      initTemplate: 'NULL'
    };
  },
  methods:{
    init(){
      this.canvas = this.$ref.canvas;
      this.bpmnModeler = new BpmnModeler({container: this.canvas});
      this.initDiagram(this.initTemplate);
    },
    initDiagram(bpmn){
      this.bpmnModeler.importXML(bpmn, err=>{
        if(Objects.isNotNull(err)){

        }
      })
    }
  },

  mounted() {
    this.init();
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
