import { createApp } from 'vue'
import { createPinia } from 'pinia'

/* import the fontawesome core */
import { library } from '@fortawesome/fontawesome-svg-core'

/* import font awesome icon component */
import { FontAwesomeIcon as fa } from '@fortawesome/vue-fontawesome'

/* import specific icons */
import { faBars,faTree,faXmark,faFilePen,faUser,faSpinner,faHouse,faCircleQuestion } from '@fortawesome/free-solid-svg-icons'
import VueAnimXyz from '@animxyz/vue3'

/* add icons to the library */
library.add(faBars,faTree,faXmark,faFilePen,faUser,faSpinner,faHouse,faCircleQuestion)

import Vue3EasyDataTable from 'vue3-easy-data-table';
import 'vue3-easy-data-table/dist/style.css';

// // const app = createApp(App);

import App from './App.vue'
import router from './router'

import './assets/main.css'
import '@animxyz/core'

const app = createApp(App)
app.component('fa', fa)
app.use(VueAnimXyz)
app.use(createPinia())
app.use(router)


app.component('EasyDataTable', Vue3EasyDataTable);

app.mount('#app')
