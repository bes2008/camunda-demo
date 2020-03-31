import Vue from 'vue'
import App from './App.vue'


import 'bpmn-js/dist/assets/diagram-js.css'
import 'bpmn-js/dist/assets/bpmn-font/css/bpmn.css'
import 'bpmn-js/dist/assets/bpmn-font/css/bpmn-codes.css'
import 'bpmn-js/dist/assets/bpmn-font/css/bpmn-embedded.css'

Vue.config.productionTip = false;

new Vue({
  render: h => h(App),
}).$mount('#app');
