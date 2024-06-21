import React from 'react'
import RestaurantCard from '../Restaurantcard/RestaurantCard'

const Favorites = () => {
  return (
    <div>
        <h1 className="py-5 text-xl font-semiblod text-center">

           Favorites
        </h1>
        <div className='flex flex-wrap  gap-3 justify-center'>
            {
                [1,1,1].map((item)=><RestaurantCard/>)
            }
        </div>
        </div>
  )
}

export default Favorites